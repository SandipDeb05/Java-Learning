package OOPs.Inheritance;

public class Singer extends Person{
    public Singer(String name) {
        super(name);
    }
    public void sing(){
        System.out.println("The singer is singing");
    }
    public void eat(){
        System.out.println("singer "+name+"is eating");
    }
}
