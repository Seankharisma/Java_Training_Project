package learing_course.basc_learn2;

public class main_learning {
    public static void main(String[] args) {
         new ssss(20);
    }

}
class ssss{
    private int age=10;

    {
        System.out.println("准备初始化。。。。");
    };
    public ssss(int age) {
        this.age = age;
        System.out.println("age"+age);
    }

    public  void ste(){
        System.out.println("zzzzzz");

    }
    public static void ggg(){
        //ste();
        //System.out.println(age);

    }


}