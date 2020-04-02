package Questions.patterns;
import java.util.Scanner;
public class Box {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        for(int i=1; i<=range; i++){
            for(int j=1; j<=range; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
