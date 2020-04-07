package OOPs.Abstraction;

public class RepairShop {
    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }
    public static void main(String[] args){
        WagonR w = new WagonR();
        Audi a = new Audi();
        repairCar(w);
        repairCar(a);
    }
}
