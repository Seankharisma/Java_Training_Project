package learing_course.extends_test;

public class animal {
    public String name;

    public animal() {
    }

    protected String sex;
    int age;
    private String decription;

    public animal(int jj) {
        System.out.println("父类构造器被调用");
        this.name="索尔";
        this.sex="男";
        this.age=100;
        this.decription="我是英国人";
        System.out.println(jj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }



}
