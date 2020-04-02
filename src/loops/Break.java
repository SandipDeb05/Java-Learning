package loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args){
//        for(int i=1; i<=100; i++){
//            if(i==50){
//                break;
//            }
//            System.out.println(i);
//        }
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a integer to print");
            int num = sc.nextInt();
            if(num<0) break;
            System.out.println("number is "+ num);
        }
    }
}
