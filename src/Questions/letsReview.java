package Questions;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class letsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.nextLine();
        for(int j=0; j<range; j++){
            String str = sc.nextLine();
            char[] charArray = str.toCharArray();
            for(int i=0; i<charArray.length; i++){
                if(i%2==0){
                    System.out.print(charArray[i]);
                }
            }
            System.out.print(" ");
            for(int i=0; i<charArray.length; i++){
                if(i%2 !=0){
                    System.out.print(charArray[i]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}



