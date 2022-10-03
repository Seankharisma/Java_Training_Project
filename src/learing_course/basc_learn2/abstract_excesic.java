package learing_course.basc_learn2;

public class abstract_excesic extends people implements err{
    //final关键字的使用
    final int age=10;
    public static void main(String[] args) {
        //lambda 方式简化
        cell cell2=(int a,int b)->{return a+b;};
        System.out.println("result:"+cell2.calc(1,2));
        abstract_excesic abstract_excesic = new abstract_excesic();
        abstract_excesic.jobdestion();

    }
    public abstract_excesic() {

        //final修饰的变量即为常量，是不能发生改变的
        //this.age=20;
    }


    @Override
    public void readMe() {

    }

    @Override
    public void jobdestion() {

    }
}
abstract class people{
    public abstract void jobdestion();

}
interface err{
    int age=90;
    void readMe();
}
interface  cell{
    int calc(int a,int b);

}