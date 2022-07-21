package learing_course.dynamicbind_learning;

/**
 * Java的动态绑定机制练习和解析
 * 动态绑定机制有两个特性：
 * 1：当调用对象方法的时候，该方法会和对象的 内存地址/运行类型 绑定
 * 2：当调用对象属性的时候，没有动态绑定机制，哪里声明，哪里使用
 */
public class dynamicBind {

    public static void main(String[] args) {
        /**
         * a 的编译类型是A，运行类型是B
         */
         A a = new B();
        /**
         * 看运行类型是B，现在B里找有没有sum方法执行，
         * 发现没有，根据继承机制去看父类，发现有执行父类的sum()
         * 但是，在执行父类的sum()之中，发现有调用getI(),此时发挥动态绑定机制！
         * 继续回去看运行类型里有没有定义getI()方法，发现有，执行，返回属性i，
         * 由于属性是没有绑定动态机制的，所以直接看当前的声明处（若此时子类里没有i的定义的会发生继承机制看父类了），直接返回20。
         * 再回到父类调用的那个位置，就是20+10=30
         */
        System.out.println(a.sum());
         System.out.println(a.sum1());
    }
}

/**
 * 创建父类
 */
class A{
    public  int i=10;
    public int sum(){
        return getI()+10;

    }
    public int sum1(){
        return i+10;
    }
    public int getI() {
        return i;
    }
}

/**
 * 创建子类
 */
class B extends A{
    public  int i=20;

//    public int sum(){
//        return getI()+20;
//
//    }
//    public int sum1(){
//        return i+10;
//    }
     public int getI() {
        return i;
    }

}