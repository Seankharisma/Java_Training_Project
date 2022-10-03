package learing_course.basic_learn;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("黑鬼","杀人");
        //重写toString方法来将对象的属性打印出来
        System.out.println(monster.toString());

    }
}

class Monster{
    private  String name;
    private  String job;

    public Monster(String name,String job) {
        this.name=name;
        this.job=job;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}