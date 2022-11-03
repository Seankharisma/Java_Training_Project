package learing_course.basc_learn2.innerclass_learning;

public class homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork((double m1,double m2)->{;return m1+m2;},20,18);


    }
}

interface  ICalculate{
    //work方法完成计算
    public double work(double m1,double m2);


}
class Cellphone{

      public void testwork(ICalculate iCalculate,double m1,double m2){
          double result=iCalculate.work(m1,m2);
          System.out.println("计算后的结果："+result);
      }


}