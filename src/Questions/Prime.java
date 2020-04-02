package Questions;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num= sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(num<2) isPrime = false;
        System.out.println("number is prime "+ isPrime);
    }
}
