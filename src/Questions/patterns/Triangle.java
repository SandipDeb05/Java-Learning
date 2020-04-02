package Questions.patterns;

public class Triangle {
    public static void main(String[] args){
        int range = 12;
        char ch= '*';
        for(int i=1; i<=range; i++){
            for(int j=1; j<=range-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%4c", ch);
            }
            System.out.println();
        }
    }
}
