package OOPs.StaticKeyWord;
import OOPs.StaticKeyWord.NewClass.NonStaticClass;
import OOPs.StaticKeyWord.NewClass.StaticClass;
public class StaticKeyWord {

    static {
        System.out.println("1st static block exe");
    }
    static {
        System.out.println("2nd static block exe");
    }
    public static void main(String[] args){
        System.out.println("hello");

        // non static class
        NewClass objNew = new NewClass();
        NonStaticClass objNewNonStatic  = objNew.new NonStaticClass();
        System.out.println(objNewNonStatic);

        // static class
        StaticClass objStatic = new StaticClass();
        System.out.println(objStatic);
    }
    static {
        System.out.println("3nd static block exe");
    }
}
