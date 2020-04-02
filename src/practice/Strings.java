package practice;

import java.util.Date;
import java.util.Locale;

public class Strings {
    public static void main(String[] args){

        System.out.println("he says to me, \"he is a good boy\" isn\'t it?");
        System.out.println("hello there \t one tab spaces \n in " +
                "the new line & one word will be missing in this wor\bld");

        System.out.printf("hello%nworld");
        System.out.printf("%b%n",2.5);
        System.out.printf("%B%n", (Object) null);


        System.out.printf("'%s'%n","sandip");
        System.out.printf("'%S'","sandip");

        System.out.printf("'%15s'", "sandip");
        System.out.printf("'%-15s'","sandip");

        System.out.printf("'%-3.2s'","sandip");

        System.out.printf("%d%n",10000L);
        System.out.printf(Locale.US,"%,d%n",10000);
        System.out.printf(Locale.ITALY,"%,d%n",10000);

        System.out.printf("%f%n",5.12345);
        System.out.printf("'%4.2f'%n",5.12345);

        System.out.printf("%5.2e%n",5.12345);

        Date date = new Date();
        System.out.printf("%tT%tp%n",date,date);
        System.out.printf("hours is: %tH,%nminute is: %tM,%nsec is: %tS",date,date,date);
        System.out.printf("%n%1$tH:%1$tM:%1$tS %1$tp",date);

        System.out.printf("%tA%n",date);
        System.out.printf("%tB%n",date);
        System.out.printf("%tY%n",date);
        System.out.printf("%te%n",date);

        System.out.printf("%1$tdst %1$tB in %1$tY, %1$tA",date);
        System.out.printf("%1$td:%1$tm:%1$ty",date);
    }

}
