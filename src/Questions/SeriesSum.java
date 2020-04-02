package Questions;
import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        float res = 0;
        for(float i=1; i<=range; i++){
            if(i%2==0){
                res -= 1/i;
            } else{
                res += 1/i;
            }
        }
        System.out.println("sum of series is "+ res);
    }
}
