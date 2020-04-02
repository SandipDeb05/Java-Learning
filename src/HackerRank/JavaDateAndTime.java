package HackerRank;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class JavaDateAndTime {
    public static void main(String[] args){
        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

        Scanner scan = new Scanner(System.in);
        System.out.printf("%s%n","Enter the date");
        int days = scan.nextInt();
        int months = scan.nextInt();
        int years = scan.nextInt();
        System.out.printf("%02d:%02d:%d%n",days,months,years);

    }
}
