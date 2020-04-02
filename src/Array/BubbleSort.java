package Array;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,1,10,-32,4,21,0};
        int range = arr.length;

        for(int i=0; i<range-1; i++){
            boolean sorted = true;
            for(int j=0; j<range-1-i; j++){
               if(arr[j+1]<arr[j]){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;

                   sorted = false;
               }
            }
            if(sorted) break;
        }
        for(int item: arr){
            System.out.print(item+ " ");
        }
    }
}
