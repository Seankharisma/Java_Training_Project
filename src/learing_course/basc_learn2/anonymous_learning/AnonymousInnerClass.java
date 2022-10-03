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

    //jdk底层在创建匿名内部类AnonymousInnerClass$1后，立刻马上实例化它，然后把地址传给tiger
    IA tiger=new IA(){
        @Override
        public void cry() {
            System.out.println("老虎叫");
        }
    };
    tiger.cry();
        System.out.println("系统定义的匿名内部类名称"+tiger.getClass());

    }

}
interface IA{//接口
    public  void cry();
}




