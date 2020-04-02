package whileLoops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check ");
        int input = sc.nextInt();
        int temp = input;
        int res = 0;
        while(temp>0){
            int lastDigit = temp%10;
            res = (res * 10) + lastDigit;
            temp /= 10;
        }
        if(res==input){
            System.out.println("The number is palindrome "+ input);
        } else{
            System.out.println("The number is not palindrome "+ input);
        }
    }
}
