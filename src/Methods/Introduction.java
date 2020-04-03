package Methods;

public class Introduction {
    public static void main(String[] args){
        int firstNum = 34;
        int secondNum = 33;
        int result = maxNumberOf(firstNum,secondNum); // method of two int para is taken in maxNumberOf()
        System.out.printf("%d%n",result);
        Dummytxt();
        sayHi("sandip");
        sayHi("nikita");

        maxOf(2.33f); // method of only one parameter is taken in maxNumberOf()
    }
    static int maxNumberOf(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static void Dummytxt(){
        System.out.print("Hello there have a nice day\n");
    }
    static void sayHi(String name){
        System.out.printf("hello %s good morning %n",name);
    }

    // method overloading
    static void maxOf(float d){
        System.out.print("number is "+ d);
    }
}
