package loops;
public class Loops {
    public static void main(String[] args){
       int n = 5;
       int factorial = 1;
       for(int i=n; i>=1; i--){
           factorial = factorial * i;
       }
        System.out.println(n+"! = " + factorial);
    }
}

