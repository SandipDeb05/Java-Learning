package Array;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {12,0,56,-76,98,-54,56};
        int range = arr.length;

        for(int i=0; i<range-1; i++){
            int minIndex = i;
            for(int j=i; j<range; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
