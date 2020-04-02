package ImportantQuestions;
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for(int i=0; i<strArr.length; i++){
            for(int j=i; j< strArr.length-1; j++){
               String temp = strArr[strArr.length-1];
                strArr[strArr.length-1] = strArr[j];
                strArr[j]= temp;
            }
            System.out.print(strArr[i]+" ");
        }
    }
}
