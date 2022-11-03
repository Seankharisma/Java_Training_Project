package learing_course.basc_learn2.innerclass_learning;

/**
 *演示局部内部类的使用
 * */
public class LocalInnerClass {
    public static void main(String[] args) {
        Out0002 out0002=new Out0002();
        out0002.m1();

    }

}

class Out0002{
    //外部类


    private int n1=100;
    private void m2(){}
    public void m1(){//方法
        //局部内部类是定义在外部类的局部位置，通常在方法
        class Inner02{//局部内部类
            private int n1=900;
            public void f1(){
                System.out.println("n1="+n1);
                //如果外部类和局部内部类的成员重名的时候，默认遵守就近原则，如果想要访问外部类的成员的话，则可以使用： 外部类名.this.成员  去访问
                System.out.println("调用外部类的成员变量n1="+Out0002.this.n1);
                m2();
            }

        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

}
