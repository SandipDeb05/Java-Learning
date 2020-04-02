package Questions.patterns;
public class NumberPattern {
    public static void main(String[] args){
        int range = 10;
        int number = 1;
        for(int i=1; i<=range; i++){
            for(int j=1; j<=range-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%4d", number++);
            }
            System.out.println();
        }
    }
}
