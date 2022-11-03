package learing_course.basc_learn2.innerclass_learning;
/**
 * 通过向上转型来做程序的活用
 *
 * */
public class homework06 {
    public static void main(String[] args) {
        Person person = new Person("小张",null);
        //测试开始
        person.passRiver();
        person.common();
        person.common();
        person.passRiver();
    }
}
//创建人对象
class Person{
    private String name;
    private  Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        //如果过河的时候不是船，则给他工具一个船
        if(!(vehicles instanceof Boat)) {
            vehicles  = VehiclesFactory.getBoat();
        }
        vehicles.Work();
    }
    public void common(){
        //一般默认情况下是一匹马，不是马的情况下则使用马
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.Work();

    }
}

//交通方式
interface Vehicles{
    public void Work();
}
//马
class Horse implements Vehicles{

    @Override
    public void Work() {
        System.out.println("一般情况下使用马儿");
    }
}
//船
class Boat implements Vehicles{

    @Override
    public void Work() {
        System.out.println("过河的时候用小船");
    }
}
class VehiclesFactory{
    //工具交通类工厂类，用staic方式来使用这个类的函数
    //静态化一匹马，只用同一匹马
    private static Horse horse=new Horse();

    //防止外面有人来使用这个类来构造对象，将这个类的构造函数设置为私有
    private VehiclesFactory() {
    }

    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}