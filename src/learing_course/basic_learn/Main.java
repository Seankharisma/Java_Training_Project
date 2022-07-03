package learing_course.basic_learn;

import java.util.Arrays;

/**
 * The type Main.
 *
 * @author Sean li
 * @version 1.0
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
	// write your code here
           /*
           int c;
           c=1+1;
           System.out.println(c);
           //输出制表符\t \是转义字符
           System.out.println("be\t");
           //输出换行符\n \是转义字符
           System.out.println("beasdfdf\ncs");
           //输出斜杠符号 \是转义字符
           System.out.println("iknmh\\cs");
           //输出冒号 \是转义字符
           System.out.println("gtukfk\"cs\"");
           //输出回车 \是转义字符
           System.out.println("kjhvgffff\riuhjn");

           System.out.println(100+20);
           System.out.println(2.7);
           System.out.println(8.1/3);
           System.out.println(Math.abs(2.7-8.1/3));
           double c1=2.7;
           double c2=2.7;
           if (c1==c2)
           {
               System.out.println("asdsds");
           }
           System.out.println('a'+10);
           char df=(char)100;
           System.out.println("df="+df);
           String cqw = "12345" ;
           System.out.println(Integer.parseInt(cqw));。
           System.out.println(10/4);


           int x=5;
           int y=5;
           boolean z=x++==y;
           System.out.println("比较：x++==y:"+ z);
           System.out.println("x:"+ x);
           System.out.println();
     */
//           Scanner scanner=new Scanner(System.in);
//           String name=scanner.next();
//           int age =scanner.nextInt();
//           System.out.println("name="+name+"\n"+"age="+age);
//           int a=-8<<2;
//           System.out.println("-8<<2:"+a);
//           System.out.println(Integer.toBinaryString(-8));
//           System.out.println(Integer.toBinaryString(a));


//             Scanner scanner=new Scanner(System.in);
//
//             int months=scanner.nextInt();
//             switch (months){
//                 case 3:
//                 case 4:
//                 case 5:
//                     System.out.println("春季");
//                     break;
//                 case 6:
//                 case 7:
//                 case 8:
//                     System.out.println("夏季");
//                     break;
//                 case 9:
//                 case 10:
//                 case 11:
//                     System.out.println("秋季");
//                     break;
//                 case 12:
//                 case 1:
//                 case 2:
//                     System.out.println("冬季");
//                     break;
//                 default:
//                     System.out.println("你输入的月分有问题");
//             }
//           System.out.println("ピラミッド展開");
//           int n=6;
//           // int m=5;
//           //int i=1;
//           //int j=1;
//           for(int i=1;i<=n;i++)
//           {
//               for (int z=1;z<=n-i;z++)
//               {
//                   System.out.print(" ");
//               }
//               for(int j=1;j<=2*i-1;j++) {
//                   if(j==1||j==2*i-1||i==n) {
//                       System.out.print("*");
//                   }else {
//                       System.out.print(" ");
//                   }
//               }
//               System.out.println("\n");
//           }

        //int count=0;
//        int v=0;
//        label1:
//        while (v!=97)
//        {
//            v=(int)(Math.random()*100)+1;
//            count++;
//        }
//        System.out.println("随机生成到97的使用次数："+count);
//        boolean f = true;
//        while(f){
//            Scanner scanner=new Scanner(System.in);
//            v = scanner.nextInt();
//            switch (v) {
//                case 1:
//                    System.out.println("我是白金会员,拥有所有权限");
//                    System.out.println("拥有玛莎拉蒂一台");
//
//                case 2:
//                    System.out.println("我是黄金会员，拥有会员权限");
//                    System.out.println("拥有一辆跑车");
//                case 3:
//                    System.out.println("我是会员，拥有游客权限");
//                    System.out.println("拥有一辆面包车");
//                case 4:
//                    System.out.println("我是游客");
//                    System.out.println("拥有一双鞋");
//                    break;
//                default:
//                    System.out.println("你退出吧，别玩了");
//                    f= false;
//            }
//        }
        //this的学习
        T t1=new T("MM",90);
        System.out.println("名称name"+t1.getTest_name()+"\n"+"年龄age："+t1.getTest_age());

        T t2=new T();
        System.out.println("名称name"+t2.getTest_name()+"\n"+"年龄age："+t2.getTest_age());

        int []a= {45,78,2,5,7,88,1};
        BubbleSort bubbleSort=new BubbleSort();
//        bubbleSort.sortArray(a);
//        bubbleSort.printArray(a);
        Arrays.sort(a);
        bubbleSort.printArray(a);
    }
}
class T{
    //封装一下,创建Test_name、Test_age的get、set方法
    private String Test_name;
    private int Test_age;
    public T(){
        this("JACK",20);
        System.out.println("This 关键字的测试");
        System.out.println("接下来测试This语句，使用其其他构造器");
    }
    public T(String Test_name,int Test_age){
        this.Test_name=Test_name;
        this.Test_age=Test_age;

    }
    public String getTest_name() {
        return Test_name;
    }

    public void setTest_name(String test_name) {
        Test_name = test_name;
    }

    public int getTest_age() {
        return Test_age;
    }

    public void setTest_age(int test_age) {
        Test_age = test_age;
    }

}
/**
 * 冒泡排序
 * */
class BubbleSort {
    public BubbleSort() {
    }

    public void sortArray(int[] arry) {
        int temp;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {
                    temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }

            }

        }

    }

    public void printArray(int []arry){
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+"\t");
        }

    }



}
