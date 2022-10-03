package learing_course.basic_learn;

public class Finalize_excrise {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car=null;
        //主动调用垃圾回收器
        System.gc();
        System.out.println("程序退出");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写了finalize方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了这个对象");
        System.out.println("我们释放了一些资源");
    }
}