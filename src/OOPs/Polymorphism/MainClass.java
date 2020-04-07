package OOPs.Polymorphism;

public class MainClass {
    public static void main(String[] args){
           // Run time polymorphism
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;
        d.walk();
        p.walk();
        System.out.println(d.name);
        System.out.println(p.name);

        greetings();
        greetings("single para");
        greetings("Hello", 5);
    }
    // compile time polymorphism
    public static void greetings(){
        System.out.println("Hi, there");
    }
    public static void greetings(String s){
        System.out.println(s);
    }
    public static void greetings(String s, int count){
        for(int i=1; i<=count; i++){
            System.out.println(s);
        }
    }
}
