package learing_course.basc_learn2.anonymous_learning;

/**
 * 匿名类的练习
 */

public class InnerClassExercise02 {

    public static void main(String[] args) {

        outcl1 outcl1 = new outcl1();
        outcl1.ttt2();

        CellPhone cellPhone = new CellPhone();
        //例子一
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("打印一下");
            }
        });

        //例子2
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("我不想打印了");
            }
        });

        //方法一：外部类访问内部类
        outcl1.inercl2 inercl2 = outcl1.new inercl2();
        inercl2.test1();
        //方法二：在外部方法里写一个返回内部类实例的方法
        outcl1.inercl2 outcl2 = outcl1.getInercl2();
        System.out.println("wwwwww");
        outcl2.test1();
    }

}

interface  Bell{
    void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }

}

class  outcl1{
    private int d=20;
    class inercl2{
        public  void  test1(){
            System.out.println("www"+d);
        }
    }
    //通过方法调用成员类
    public void  ttt2(){
        inercl2 inercl2 = new inercl2();
        inercl2.test1();
    }
    public inercl2 getInercl2(){

        return new inercl2();
    }

}

