package OOPs.FinalKeyword;

public final class Student {
    final int rollNo; // blank final variable
    final String name;
    {
        rollNo = 23; // initilizer block
    }
    public Student(){
        name = "Akash"; // constructor
    }
    public final void getDecription(){
        System.out.println("the student name is "+ name);
    }
}
