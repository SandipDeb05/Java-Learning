package Basics.DataType;

public class lightYear {
    public static void main(String[] args){
        int lightSpeed;
        long days, seconds, distance;
        // approx speed of light in miles per second
        lightSpeed = 186000;
        days = 1000; // specify number of days here
        seconds = days * 60 * 60; // convert to second
        distance = lightSpeed * seconds;
        System.out.println("In "+ days +" days light will travel about "+distance+" mile");
    }
}
