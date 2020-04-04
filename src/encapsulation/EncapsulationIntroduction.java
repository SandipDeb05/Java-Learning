package encapsulation;

public class EncapsulationIntroduction {
    public static void main(String[] args){
        Student obj = new Student();
//        obj.name = "sandip";
//        obj.age = 23;
        obj.setAge(12);
        System.out.println(obj.getAge());
    }
}
