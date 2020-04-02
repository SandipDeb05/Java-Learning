package Questions.patterns;
public class HalfTriangleOopReverse {
    public static void main(String[] args){
        int range = 10;
        for(int i=1; i<=range; i++){
            for(int j=1; j<=range-i+1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
