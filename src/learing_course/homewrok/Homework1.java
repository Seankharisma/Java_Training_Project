package learing_course.homewrok;

public class Homework1 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("li", 20, "医生", '男', 20000.0);
        Doctor doctor2 = new Doctor("li5", 20, "医生", '男', 20000.0);
        System.out.println(doctor1.equals(doctor2));
    }
}
