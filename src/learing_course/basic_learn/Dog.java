package learing_course.basic_learn;

import learing_course.extends_test.animal;

public class Dog extends animal {
    protected  int Yy=5;
    public Dog() {
        super(20    );
        System.out.println("子类构造器被调用");

    }

    public void getSomething(){
        System.out.println("name:"+this.name);
        System.out.println("sex:"+this.sex);
        System.out.println("默认变量在不同包时候，不能直接访问，这个是通过公共方法来访问：age:"+this.getAge());
        System.out.println("私有变量不能直接访问，这个是通过公共方法来访问：decription:"+this.getDecription());
    }
}
