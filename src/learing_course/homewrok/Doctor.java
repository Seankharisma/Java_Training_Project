package learing_course.homewrok;

public class Doctor {
    //属性
    private String name;
    private int age;
    private  String job;
    private  char gender;
    private  double sal;

    public Doctor(String name,int age,String job,char gender,double sal) {
        this.name=name;
        this.age=age;
        this.job=job;
        this.gender=gender;
        this.sal=sal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    //重写父类（object)的equals()方法，判断比较两个对象
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        //判断obj是否是Doctor类型或者子类
        if(!(obj instanceof Doctor)){
            //不是Doctor类行或者其子类，直接返回false
            return false;
        }

        //向下转型，因为obj的运行类型是Doctor或者其子类行
        Doctor doctor=(Doctor)obj;
        return this.name.equals(doctor.name)&&this.age==doctor.age&&
                this.sal==doctor.sal&&this.gender==doctor.gender&&this.job.equals(doctor.job);

    }


}