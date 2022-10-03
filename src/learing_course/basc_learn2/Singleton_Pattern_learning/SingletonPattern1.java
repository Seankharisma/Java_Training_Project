package learing_course.basc_learn2.Singleton_Pattern_learning;

/**
 * 饿汉式：你可能还没用到这个类，但是由于类加载、创建的机制，它其实已经存在了，显得很急。
 * 如何保证我们只能创建一个girlfrend对象
 *  1、构造器私有化
 *  2、在类的内部直接创建对象（对象是static）
 *  3、提供一个公共方法的static方法，返回gf对象
 *  4、存在浪费资源的问题
 * */
public class SingletonPattern1 {
    public static void main(String[] args) {

        GirlFriend instance = GirlFriend.getInstance();
        //打印下地址
        System.out.println(instance);
    }
}
class GirlFriend{
    private  String name;
    //为了能够在静态方法中返回gf对象，需要将此变量的修饰符改为static
    private  static GirlFriend gf=new GirlFriend("小红红");

    //构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
     return  gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
