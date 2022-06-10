package Training;

import java.util.Random;

/**
 * The type Main.
 *
 * @author Sean li
 * @version 1.0
 */
public class MiGong_Test {
    /**
    * 解破解迷宫游戏开启入口
    *
    * */
     public static void main(String[] args) {

         //输入信息的话正式测试时候使用
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("输入迷宫的横坐标/行数");
//         int x_coordinate= scanner.nextInt();
//         System.out.println("输入迷宫的纵坐标/列数");
//         int y_coordinate=scanner.nextInt();
//         System.out.println("开始创建迷宫");
         //迷宫的横坐标/行数
         int x_coordinate= 12;
         //迷宫的纵坐标/列数
         int y_coordinate=12;
         int [][]miGongArray;
         int flg=2;
         MiGong_Game miGong=new MiGong_Game();
         //创建迷宫
         miGongArray=miGong.create_MiGong(x_coordinate,y_coordinate);
         //走迷宫 起始坐标1，1
         miGong.findWay(miGongArray,1,1);
         if(miGongArray[1][1]==9){
             System.out.println("这是一个死迷宫，请你重置迷宫吧");
             flg=3;
         }
         //打印行走结果
         miGong.printArray(miGongArray,flg);
    }
}
/**
* 创建迷宫游戏类
*
* */
class MiGong_Game{
    /**
    * 创建迷宫
    * */
    public int[][] create_MiGong(int x_coordinate,int y_coordinate){
        int [][] miGongArray=new int[x_coordinate][y_coordinate];
        Random random=new Random();
        /**数字越大，出现迷宫内障碍物的概率越小
         * （rand_range-3）/rand_range的概率生成能走动的空间
         * rand_range>=3起步设置
         */
        int rand_range=7;
        //生成在rand_range范围的随机数，初始值为0
        int rand_Parameter=0;
        /**
         * 迷宫墙壁的创建
         *
         * */
        for (int i=0;i<miGongArray.length;i++){
            for(int j=0;j<miGongArray[i].length;j++)
            {
                if (i==0||i==miGongArray.length-1||j==0||j==miGongArray[i].length-1) {
                    //设置1位障碍物
                    miGongArray[i][j] = 1;
                }
                else if ((i==1&&j==1)||(i==miGongArray.length-2&&j==miGongArray[i].length-2)){
                    //起点与终点的设置
                    miGongArray[i][j] = 0;
                }
                else{
                    /**
                     * 迷宫里障碍物的生成
                     */
                    //设置0为可行走空间
                    rand_Parameter=random.nextInt(rand_range);
                    if(rand_Parameter<=rand_range-3) {
                        miGongArray[i][j] = 0;
                    }
                    else{
                        miGongArray[i][j] = 1;
                    }
                }
            }
        }
        //显示迷宫
        printArray(miGongArray,1);
        return miGongArray;
    }
    /**
     * 显示迷宫
     * */
    public void printArray(int [][]miGongArray,int flg){
        if(flg==1) {
            System.out.println("==========================迷宫生成，这是一个"+(miGongArray.length)+"*"+miGongArray[(miGongArray.length-1)].length+"迷宫====================");
        }
        else if(flg==2)
        {
            System.out.println("==========================破解迷宫成功！====================");
        }
        else{
            System.out.println("==========================破解迷宫失败！死迷宫！====================");
        }
        for (int i=0;i<miGongArray.length;i++){
            for(int j=0;j<miGongArray[i].length;j++){
            System.out.print(miGongArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /**
     * 开始走迷宫
     * 选择走法则是 右>下>左>上
     * */
    public boolean findWay(int [][]miGongArray,int i,int j){
        //每次走之前判断：终点的状态是否被走过的时候直接返回true，5表示正在走的位置
        if(miGongArray[miGongArray.length-2][miGongArray[miGongArray.length-2].length-2]==5){
           return true;
        }
        //判断：当前的格子是否是可以走，可以走的话就进入走法判断，不可以走则直接返回false
        else if (miGongArray[i][j]==0)
        {
            //可以走，在走和走过的位置上赋值为5，进入走法判断
            miGongArray[i][j]=5;
               //递归往右走
            if(findWay(miGongArray,i,j+1)){
                return true;
            }
                //递归往下走
            else if(findWay(miGongArray,i+1,j)){
                return true;
            }   //递归往左走
            else if(findWay(miGongArray,i,j-1)){
                return true;
            }   //递归往上走
            else if(findWay(miGongArray,i-1,j)){
                return true;
            }
            else{
                //走到死路的时候都赋值为9（试错）
                miGongArray[i][j]=9;
                return false;
            }
        }
        else{
            //都走不了遇到1或者5或者9，都走过了或者碰壁就返回false
            return  false;
        }
    }
}
