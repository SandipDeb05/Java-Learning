package Questions;
import java.util.Scanner;
public class Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the series");
        int num = sc.nextInt();
        float res = 0;
        for(float i=1; i<=num; i++){
            res += 1/i;
            System.out.print("1 / "+ i+" + ");
        }
        System.out.print(" = "+res);
    }
}
