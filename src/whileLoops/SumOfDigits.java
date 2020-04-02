package whileLoops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum ");
        int input = sc.nextInt();
        int NoOfDigits = (int) Math.log10(input);
        System.out.println("number of digits entered "+ NoOfDigits);
        int temp = input;
        int sum = 0;
        System.out.println("the process is defined below");
        while(temp>0){
            int lastDigit = temp%10;
            sum = lastDigit + sum;
            temp/=10;
            System.out.println(input+" "+temp+" "+lastDigit+" "+ sum);
        }
        System.out.println("The sum of digit "+ input+ " is " + sum);
    }
}
