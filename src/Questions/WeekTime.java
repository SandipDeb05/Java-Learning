package Questions;

import java.util.Scanner;
import java.time.LocalDate;

public class WeekTime {
    public static void getWeek(int year, int month, int day){
        LocalDate date = LocalDate.of(year, month, day);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        getWeek(year, month,day);
    }
}
