package OOPs.Inheritance;

public class Person {
    protected String name;
    public Person(String name ){
        this.name = name;
        System.out.println("inside person constructor");
    }
    public void walk(){
        System.out.println("Person "+name+" can walk");
    };
    public void eat(){
        System.out.println("person "+name+" the person can eat");
    }
}
