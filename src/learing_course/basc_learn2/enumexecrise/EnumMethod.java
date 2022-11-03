package learing_course.basc_learn2.enumexecrise;

public class EnumMethod {
    public static void main(String[] args) {
        Enumeration04 autumn = Enumeration04.AUTUMN;
        //枚举调用name方法，输出枚举常量名称
        System.out.println(autumn.name());
        //输出这是第几个枚举（从0开始  ），调用ordinal
        System.out.println(autumn.ordinal());
        //从反编译可以看出values方法，返回Enumeration04[]
        //包含定义的所有枚举对象
        Enumeration04[] values=Enumeration04.values();
        //增强for循环，依次从数组values取数值给season，如果取出完毕则退出for循环
        System.out.println("取出枚举对象");
        for(Enumeration04 seanson:values){
            System.out.println(seanson);
        }
        //valueOf将字符串转化为枚举对象，并且对象名称必须是已有的常量定义
        Enumeration04 enumeration222=Enumeration04.valueOf("AUTUMN");
        System.out.println("打印一个新对象："+enumeration222);
        //compareTo的使用:秋天的序号减去春天的序号=》 2-0=2
        System.out.println(Enumeration04.AUTUMN.compareTo(Enumeration04.SPRING));

    }

}
