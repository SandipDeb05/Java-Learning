package Array;

class Number{
    int number = 10;
    public void description(){
        System.out.printf("%s%n", "number is "+ number);
    }
    public void hola(){
        System.out.printf("%s%n", "number is "+ number);
    }
}
public class Hello {
    public static void main(String[] args){
    Number num1 = new Number();
    num1.description();
    num1.hola();
    }
}
