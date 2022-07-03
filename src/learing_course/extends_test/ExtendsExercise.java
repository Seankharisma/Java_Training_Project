package learing_course.extends_test;

import learing_course.basic_learn.Dog;

public class ExtendsExercise {
    public static void main(String[] args) {
        Pc pc = new Pc("A",100,10,"IBM");
        pc.printInfo();
        System.out.println(pc.getYy());

    }

}

class Compter extends Dog {

    private String cpuName;
    private Long memorySize;
    private int hardDisk;
    private int Yy;
    public Compter(String cpuName,long memorySize,int hardDisk) {
    this.cpuName=cpuName;
    this.hardDisk=hardDisk;
    this.memorySize=memorySize;
    Yy=super.Yy;
    }
    public String getDetails(){
        return " cpu="+cpuName+" memorySize="+memorySize+" hardDisk="+hardDisk;
    }
    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public Long getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Long memorySize) {
        this.memorySize = memorySize;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getYy() {
        return Yy;
    }

    public void setYy(int yy) {
        Yy = yy;
    }
}

class Pc extends Compter{
    String brandName;


    public Pc(String cpuName, long memorySize, int hardDisk,String brandName) {
        super(cpuName, memorySize, hardDisk);
        this.brandName=brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public  void printInfo(){
        //打印资讯
        System.out.println(getDetails()+" brandName="+brandName);
    }
}

class NotePad extends animal {
    String ColorName;
    public NotePad(){

    }

}
