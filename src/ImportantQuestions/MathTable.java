package ImportantQuestions;
import java.util.Scanner;
public class MathTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rage of the Multiplication table");
        int range = input.nextInt();
        System.out.print("X");
        for(int i=1; i<=10;i++){
            System.out.printf("%4d", i);
        }
        System.out.println();
        for(int i=1; i<=range;i++){
            System.out.print(i);
            for(int j=1; j<=10; j++){
//              System.out.print(i * j +" ");  // my logic
                System.out.printf("%4d", i*j); // string method from stackOverFlow
            }
            System.out.println();
        }
    }
}
