package OOPs.Abstraction;

public class Audi extends Car{
    @Override
    public void accelerate(){
        System.out.println("Audi is accelerated");
    }
    @Override
    public void breaking(){
        System.out.println("Audi is breaking");
    }
}
