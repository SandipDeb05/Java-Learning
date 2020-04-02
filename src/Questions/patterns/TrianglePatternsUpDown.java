package Questions.patterns;
import java.util.Scanner;
public class TrianglePatternsUpDown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int range = sc.nextInt();
        int rows = 2 * range - 1;
        for(int i=1; i<=rows; i++){
            if(i<=range){
                for(int j=1; j<=i; j++){
                    System.out.print("*  ");
                }
            } else{
                for(int j=1; j<= rows-i+1; j++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
