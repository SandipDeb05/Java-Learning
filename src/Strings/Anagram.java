package Strings;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 1st string");
//        String str1 = sc.nextLine();
//        System.out.println("Enter the 2nd string");
//        String str2 = sc.nextLine();
//        boolean isAnagram = false;
//        boolean[] visited = new boolean[str2.length()];
//        if(str1.length() == str2.length()){
//            for(int i=0; i< str1.length(); i++){
//                char ch = str1.charAt(i);
//                isAnagram = false;
//                for(int j=0; j<str2.length(); j++){
//                    if(str2.charAt(j)==ch && !visited[j]){
//                        isAnagram = true;
//                        visited[j] = true;
//                        break;
//                    }
//                }
//                if(!isAnagram){
//                    break;
//                }
//            }
//        }
//        if(isAnagram){
//            System.out.println("anagram");
//        } else{
//            System.out.println("not anagram");
//        }


        /*
          =============================== optimaize method =================================
         */

//        String str1 = "abs@@53";
//        String str2 = "sba";
//        boolean isAnagram = true;
//
//        int[] strArr1 = new int[256];
//        int[] strArr2 = new int[256];
//
//        for(char e: str1.toCharArray()){
//            int index = (int) e;
//            strArr1[index]++;
//        }
//        for(char e: str2.toCharArray()){
//            int index = (int) e;
//            strArr2[index]++;
//        }
//        for(int i=0; i<256; i++){
//            if(strArr1[i] != strArr2[i]){
//                isAnagram = false;
//            }
//        }
//        if(isAnagram) {
//            System.out.println("yes");
//        }else{
//            System.out.println("not");
//        }


        /*
        ==================================== more optimise code =====================
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String str2 = sc.nextLine();

        String a = str1.toLowerCase();
        String b = str2.toLowerCase();
        boolean isAnagram = true;

        int[] strArr1 = new int[256];

        for(char e: a.toCharArray()){
            int index = (int) e;
            strArr1[index]++;
        }
        for(char e: b.toCharArray()){
            int index = (int) e;
            strArr1[index]--;
        }
        for(int i=0; i<256; i++){
            if(strArr1[i] != 0){
                isAnagram = false;
            }
        }
        if(isAnagram) {
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }


    }
}