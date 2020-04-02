package Questions.patterns;

public class HalfOopTriangle {
    public static void main(String[] args){
        int range=10;
        for(int i=1; i<=range; i++){
            for(int j=range; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
