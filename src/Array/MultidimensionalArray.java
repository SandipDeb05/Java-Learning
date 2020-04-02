package Array;

public class MultidimensionalArray {
    public static void main(String[] args){
//        int arr[][] = new int[5][3];
        int[][] b = {
                {2,3,5,6,8},
                {3,4,5,6},
                {42,14,455}
        };
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}

