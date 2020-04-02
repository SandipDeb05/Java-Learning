package Array;
public class ArrayIntro {
    public static void main(String[] args){
//        int[] marks = new int[];

//        int[] marks;
//        marks = new int[];

//        int marks[] = new int[5];
//        System.out.println(marks[1]);

        int[] age = {2,3,4,5,6};
        double[] marks = {1.0, 2.14, 2.13};
        marks[1] = 22.32;
        for(int i=0; i<= marks.length-1; i++){
            System.out.println(marks[i]);
        }
    }
}
