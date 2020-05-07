package Basics.dataTypes;

public class charSet {
    public static void main(String[] args) {
        char ch1, ch2, ch3;
        ch1 = 88; // code for X
        ch2 = 'Y';
        ch3 = ch2++; // ch2 is incremented but ch3 will store old value of ch2?
        System.out.println(ch1 + " " + ch2 + " " + ch3);
    }
}


