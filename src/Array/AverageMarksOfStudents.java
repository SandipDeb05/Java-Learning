package Array;
import java.util.Scanner;
public class AverageMarksOfStudents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int noOfStudents = sc.nextInt();
        int[] marks = new int[noOfStudents];
        int totalMarks = 0;
        for(int i=0; i<=noOfStudents - 1; i++){
            System.out.println("Enter the marks of student "+i);
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        float averageMarks = (float) totalMarks/noOfStudents;
        System.out.println("The total marks is "+ totalMarks+ " average is "+ averageMarks);
    }
}
