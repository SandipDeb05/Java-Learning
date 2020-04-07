package OOPs.Abstraction;

public class WagonR extends Car{
    @Override
    public void accelerate(){
        System.out.println("WagonR is accelerated");
    }
    @Override
    public void breaking(){
        System.out.println("wagnoR is breaking");
    }
}
