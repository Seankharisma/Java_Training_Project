package learing_course.basc_learn2.Singleton_Pattern_learning;
/**
 * 懒汉式：
 * 如何保证我们只能创建一个girlfrend对象
 *  1、构造器私有化
 *  2、在类的内部直接创建对象（对象是static）
 *  3、提供一个公共方法的static方法，返回gf对象
 *
 *
 * */
public class SingletonPattern2 {
    public static void main(String[] args) {
       // 第一次调用，创建了对象
       Cat instance = Cat.getInstance();
       System.out.println(instance.toString());
        // 第二次调用，返回的是第一次的对象，构造函数没有执行两次
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2.toString());
    }
}
/**
 * 懒汉式
 * 1、仍然构造器私有化
 * 2、定一个静态属性对象
 * 3、提供一个public的static方法，可以返回一个cat的对象
 * 4、懒汉式，只有当用户实用getInstance时候，才返回cat对象，后面再次调用时，回返回上次创建的cat对象
 * 从而保证单但例
 * 5、存在线程风险问题
 * */
class Cat{
    private  String name;
    private static int m1=999;
    //定一个静态属性对象
    private  static Cat cat;

    //构造器私有化
    private Cat(String name) {
        System.out.println("构造器被调用....");
        this.name=name;
    }
    /**
     * 这里存在线程风险：
     * 假设有三个线程按照顺序来调用它的时候，
     *线程一还没有创建的时候，线程二就来了，线程二还没创建完的时候线程三
     *　最终结果并不是所谓的单例，因为还是创建了三个对象，保留了最后一个对象。
     * */
    public static Cat getInstance(){
        //在次调用时，不为null时将返回已经创建对象
        if(cat==null){
            cat=new Cat("小可爱");
        }
        return  cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
