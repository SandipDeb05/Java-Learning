package Questions;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int range = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for(int i=2; i<=range; i++){
            int num3 = num1 + num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }
}
