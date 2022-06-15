package learing_course.basic_learn;


import java.util.Random;
import java.util.Scanner;

/**
 * 石头剪刀布
 *
 * */
public class RockPaperScissorsTest {

    public static void main(String[] args) {
          Game game=new Game();
          game.gameStart();

    }
}
/**
 * 游戏类的构造
 * */
class Game{

    //总局数
    int count=0;
    //你赢局数
    int winCount=0;
    //你输局数
    int lossCount=0;
    //你平局局数
    int drawCount=0;
    /**
     * 游戏模式的选择
     * */
    public void gameStart(){
        Scanner scanner=new Scanner(System.in);
        int choiceFlag;
        do{
            System.out.println("选择模式：0-人机对战，1-CPU之间对战,2-退出");
            choiceFlag=scanner.nextInt();
            if(choiceFlag==0) {
                System.out.println("进入人机对战模式");
                CompareResult();
            }
            else if(choiceFlag==1){
                System.out.println("进入CPU之间对战模式");
                VsComputer2();
            }
            else if(choiceFlag==2){
                System.out.println("退出游戏！");
                choiceFlag=3;
            }
            else {
                System.out.println("选择参数有问题，重新输入吧");
                choiceFlag=0;
            }
        }while (choiceFlag==0||choiceFlag==1);

    }
    /**
     * 开始游戏
     * */
     public void CompareResult(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("游戏开始");
            boolean continueFlag=true;
            int hand;
            String continuePar;
            while (continueFlag) {
                System.out.println("0-石头、1-剪刀、2-布，选择其他的话则表示输入错误");
                hand = scanner.nextInt();
                if(hand==0||hand==1||hand==2) {
                    VsComputer(hand);
                    System.out.println("是否还要继续游戏？y/n y->是，n->不继续");
                    continuePar=scanner.next();
                    if(continuePar.equals("n")){
                        continueFlag=false;
                    }

            }else {
                    System.out.println("选择参数有问题，重新输入吧");
                }

            }
            System.out.println("返回上一层菜单");
     }
     /**
      * 人机对战
      * */
     public void VsComputer(int hand){
         String [] resultArray;
         Random random=new Random();
         int rand_Parameter=random.nextInt(3);
         resultArray=rulerCompare(hand,rand_Parameter);
         System.out.println("你"+resultArray[0]+"了,"+resultArray[1]+","+resultArray[2]);
         System.out.println("战绩：赢->"+this.winCount+"局  输->"+this.lossCount+"局  平->"+this.drawCount+"局");
         System.out.println("总局数："+this.count);
     }
     /**
      * 两台电脑对决
      * **/
    public void VsComputer2(){
        String [] resultArray;
        Random random=new Random();
        int pc1=random.nextInt(3);
        int pc2=random.nextInt(3);
        resultArray=rulerCompare(pc1,pc2);

        System.out.println("pc1"+resultArray[0]+"了,pc1"+resultArray[1]+",pc2"+resultArray[2]);
        System.out.println("战绩：赢->"+this.winCount+"局  输->"+this.lossCount+"局  平->"+this.drawCount+"局");
        System.out.println("总局数："+this.count);
        //pc1胜利的时候停止游戏
        if(resultArray[0].equals("赢")) {
            this.count=0;
            this.winCount=0;
            this.lossCount=0;
            this.drawCount=0;
        }else{
            //不赢是不是，我继续！
            VsComputer2();
        }
    }
    /**
     * 游戏规则
     * */
     public String[] rulerCompare(int userHand,int computerHand){
        String [] rulerArr=new String[3];
        if(userHand==computerHand){
            rulerArr[0] = "平局";
            if(userHand==0){
                rulerArr[1] = "你出了石头";
                rulerArr[2] = "电脑出了石头";
            }else if(userHand==1){
                rulerArr[1] = "你出了剪刀";
                rulerArr[2] = "电脑出了剪刀";
            }else if(userHand==2){
                rulerArr[1] = "你出了布";
                rulerArr[2] = "电脑出了布";
            }else {
                rulerArr[0] = "error";
            }
            this.count++;
            this.drawCount++;
            return rulerArr;
        }else if(userHand==0){
            rulerArr[1] = "你出了石头";
            if(computerHand==1) {
                rulerArr[0] = "赢";
                rulerArr[2] = "电脑出了剪刀";
                this.winCount++;
            }else if(computerHand==2){
                rulerArr[0] = "输";
                rulerArr[2] = "电脑出了布";
                this.lossCount++;
            }else{
                rulerArr[0] = "error";
                return rulerArr;
            }
            this.count++;
            return rulerArr;
         }
        else if(userHand==1){
            rulerArr[1] = "你出了剪刀";
            if(computerHand==0) {
                rulerArr[0] = "输";
                rulerArr[2] = "电脑出了石头";
                this.lossCount++;
            }else if(computerHand==2){
                rulerArr[0] = "赢";
                rulerArr[2] = "电脑出了布";
                this.winCount++;
            }else{
                rulerArr[0] = "error";
                return rulerArr;
            }
            this.count++;
            return rulerArr;
        }else if(userHand==2){
            rulerArr[1] = "你出了布";
            if(computerHand==0) {
                rulerArr[0] = "赢";
                rulerArr[2] = "电脑出了石头";
                this.winCount++;
            }else if(computerHand==1){
                rulerArr[0] = "输";
                rulerArr[2] = "电脑出了剪刀";
                this.lossCount++;
            }else{
                rulerArr[0] = "error";
                return rulerArr;
            }
            this.count++;
            return rulerArr;
        }
        else{
            rulerArr[0] = "error";
            return rulerArr;
        }


     }




}