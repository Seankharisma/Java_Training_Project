package learing_course.basc_learn2.interface_learning;
interface A{
    double PI=3.14;
    double gg();
}
interface B{
    int OP=10;
    double zz();

}
interface C extends A,B{
    double PI=10.5;
    double mm();

}

public class interface_training implements  C {

    public static void main(String[] args) {
        interface_training interface_training2 = new interface_training();
        System.out.println(interface_training2.mm());
        System.out.println("asdsad"+interface_training.PI);
        //interface        //interface_training2.mm();_training2.mm();


    }
    @Override
    public double gg() {
        return 0;
    }

    @Override
    public double zz() {
        return 0;
    }

    @Override
    public double mm() {
        return PI+1;
    }
}
