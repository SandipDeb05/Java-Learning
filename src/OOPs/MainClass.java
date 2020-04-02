package OOPs;
class Cat{
    boolean hasFur;
    String color, breed;
    int legs, eyes;

    public void walk(){
        System.out.printf("%S%n", "the cat is waking");
    }
    public void eat(){
        System.out.printf("%s%n", "the cat is eating");
    }
    public void description(){
        System.out.println("my cat has "+ legs+ " legs and "+eyes+" eyes");
    }
};
public class MainClass {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.walk();
        cat2.eat();
        cat1.legs=4;
        cat1.eyes=2;
        cat2.legs = 1;
        cat2.eyes = 3;
        cat1.description();
        cat2.description();
    }
}
