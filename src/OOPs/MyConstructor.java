package OOPs;

class Vehical{
    int wheels;
    int headLights;
    String color;
    // default constructor
    Vehical(){

    }
    // parameterize constructor
    Vehical(int wheels){
        this.wheels = wheels; // initialize here
        headLights = 2;
    }
    // constructor overloading
    Vehical(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        headLights = 3;
    }
}

public class MyConstructor {
    // no arg constructor
    MyConstructor(){
        System.out.println("object is now created");
    }
    public static void main(String[] args){
        MyConstructor object = new MyConstructor();
        Vehical car = new Vehical(20);
        Vehical train = new Vehical(300, "red");
        Vehical bike = new Vehical();
//        car.wheels = 8; // assign a value or updating
        System.out.println(bike.wheels); // default value
        System.out.println(car.wheels+ " wheels "+ car.headLights+" light");
        System.out.println(train.wheels+" wheels "+ train.headLights+ " lights & color is "+ train.color);
    }
}
