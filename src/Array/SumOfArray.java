package Array;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int rows= sc.nextInt();
        System.out.println("Enter the numbers of columns");
        int cols = sc.nextInt();

        int[][] arrA = new int[rows][cols];
        System.out.println("Enter the elements of 1st array ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arrA[i][j] = sc.nextInt();
            }
        }

        int[][] arrB = new int[rows][cols];
        System.out.println("Enter the elements of 2nd array ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arrB[i][j] = sc.nextInt();
            }
        }
        int[][] arrC = new int[rows][cols];
        System.out.println("sum of array is ");
       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               arrC[i][j] =arrA[i][j] * arrB[i][j];
               System.out.printf("%4d",arrC[i][j]);
           }
           System.out.println();
       }
    }
}
