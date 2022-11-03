package learing_course.basc_learn2.enumexecrise;


public enum Enumeration03 {
    SPRING("春天","温暖"),
    WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),
    SUMMER("夏天","炎热"),
    wait;   //当是无参构造方法是可以直接wait或者wait()

    @SuppressWarnings({"all"})
    private  String name;
    private  String desc;

    //增加一个无参构造方法
    Enumeration03() {
    }



    Enumeration03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
