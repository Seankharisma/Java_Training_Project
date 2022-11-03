package learing_course.basc_learn2.anonymous_learning;

public class AnonymousInnerClass {
    public static void main(String[] args) {
    /**
     * 匿名内部类的使用
     *  1、某些类只想使用一次，后面不再使用，简化开发
     *  2、tiger的编译类型：IA
     *  3、tiger的运行类型：就是匿名内部类 系统底层会分配一个类名：AnonymousInnerClass$1
     *  4、匿名类只使用一次，就不能再用了。
     * */

    //例子1 jdk底层在创建匿名内部类AnonymousInnerClass$1后，立刻马上实例化它，然后把地址传给tiger
    IA tiger=new IA(){
        @Override
        public void cry() {
            System.out.println("老虎叫");
        }
    };
    tiger.cry();
        System.out.println("系统定义的匿名内部类名称"+tiger.getClass());

        //例子2 基于抽象类的匿名内部类,必须实现该方法
        Analge analge  =new Analge(){
            @Override
            void eat() {
                System.out.println("吃东西");
            }
        };
        analge.eat();
   //例子3  参数传递，这里的jack会传到father的构造方法里
        /**
         * 相当于   class AnonymousInnerClass$3 extends Father{
         *     @Override
         *   public void test() {
         * System.out.println("跑了个test方法");
         * }
         * */
        Father father=new Father("JACK"){
            @Override
            public void test() {
                System.out.println("跑了个test方法");
            }
        };
        father.test();
        System.out.println("father的匿名内部类名称"+father.getClass());

        //改变一下写法
        new Father("PHONE"){
            @Override
            public void test() {
                super.test();
                System.out.println("跑了个test方法,重写-孩子");
            }
        }.test();



    }
}
interface IA{//接口
  void cry();
}
abstract class Analge{
 abstract void eat() ;
}
class Father{
    String name;
    public Father(String name) {
        this.name=name;
        System.out.println("接收到了name="+this.name);
    }
    public  void test(){
        System.out.println("父亲");
    }
}



