package practice;
import java.util.*;

public class HackerRank {
    public static <Char> void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        int[] str1 = new int[256];
        int[] str2 = new int[256];
        boolean isGreater = true;

       for(char e: A.toCharArray()){
           int index = (int) e;
           str1[index]++;
       }
       for(char e: B.toCharArray()){
            int index = (int) e;
            str2[index]++;
       }
       for(int i=0; i<256; i++){
           if(str1[i] > str2[i]){
               isGreater = true;
           }
           else{
              isGreater = false;
           }
       }
       if(isGreater){
           System.out.println("yes");
       }else{
           System.out.println("no");
       }
        String str3 = A.concat(" "+B);
        String[] str4 = str3.split(" ");
        String capitalize="";
        for(String w: str4){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            capitalize += first.toUpperCase()+afterFirst+" ";
        }
        System.out.print(capitalize.trim());


    }

}
