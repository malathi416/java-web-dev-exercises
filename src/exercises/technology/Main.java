package exercises.technology;

public class Main {
    public static void main(String[] args){
        Computer lenovo = new Laptop("Lenovo",64,14.0,2.0,2);
        System.out.println(((Laptop)lenovo).getNumberOfUSBPorts());
        System.out.println(lenovo.getBrand());
        Computer apple = new SmartPhone("Apple",64,5.6,.5,true);
        System.out.println(((SmartPhone)apple).getScreenProtected());
    }

}
