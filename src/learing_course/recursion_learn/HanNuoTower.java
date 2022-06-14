package learing_course.recursion_learn;

public class HanNuoTower {
    public static void main(String[] args) {
     Tower tower=new Tower();
     tower.moveNum(2,'A','B','C');

    }
}
class Tower{

    /**
     * 关于理解，请理解盘子为1哥，2个，以及2个，3个的情况，3个和3个以上是一个规律
     * */
    public void moveNum(int num,char a,char b,char c)
    {
        //当只有一块的时候直接移到C
        if(num==1){
            System.out.println("移走一块："+a+" -> "+c);
        }
        else {
            //当右超过一块以上的话现移到B塔，借用c
            moveNum(num-1,a,c,b);
            System.out.println(a+" -> "+c);
            //将B塔数据移到c借用a
            moveNum(num-1,b,a,c);

        }
    }

}
