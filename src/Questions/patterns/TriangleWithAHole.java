package Questions.patterns;

import java.util.Scanner;

public class TriangleWithAHole {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        System.out.println("*");
        for(int i=2; i<=range-1; i++){
            System.out.print("* ");
            for(int j=1; j<=i-2; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        if(range>1){
            for(int i=1; i<=range; i++){
                System.out.print("* ");
            }
        }
    }
}
