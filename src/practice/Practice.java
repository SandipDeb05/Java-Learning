package practice;

import java.util.Date;
import java.util.Locale;

public class Practice {
    public static void main(String[] args){
//        System.out.print("hello \nworld");
//        System.out.printf("hello%nworld");
//        System.out.printf("%B%n", 5.4);
//            System.out.printf("'%s' %n","hello world");
//        System.out.printf("'%4.2s' %n","hi there");
//        System.out.printf("interest: %d%n", 10000L);
//        System.out.printf(Locale.US, "%,d%n", 10000);
        Date date = new Date();
        System.out.printf("Hrs: %1$tH min: %1$tM sec: %1$tS",date);

    }

}
