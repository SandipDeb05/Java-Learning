package Questions;
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        float num = sc.nextFloat();
        System.out.println("Enter the power");
        float pow = sc.nextFloat();
        float res = 1;
        for(int i=1; i<=pow; i++){
            res *= num;
        }
        System.out.println(num+" pow "+ num+" = "+ res);
    }
}
