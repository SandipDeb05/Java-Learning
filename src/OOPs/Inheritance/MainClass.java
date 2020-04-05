package OOPs.Inheritance;

public class MainClass {
    public static void main(String[] args){
        Teacher teacher = new Teacher("akash");
        teacher.name = "Sandip Deb ";
        teacher.eat();
        teacher.walk();
        teacher.teach();

        Singer singer = new Singer("akash");
        singer.name = "Nikita Deb";
        singer.sing();
        singer.eat();
        singer.walk();

        /*
        Upcasting & down casting
         */

        Person person = teacher; // upcasting

        Person perr = new Person("Akash");
//        Teacher teach = perr // run time error
//        Teacher teach = (Teacher) perr; // compile time error

        Singer sing = new Singer("Akash");
        Person ps = teacher;
//        Person perr = teacher;
        Teacher terr = (Teacher) ps;

        System.out.println(teacher instanceof Teacher);
        System.out.println(sing instanceof Singer);
        System.out.println(teacher instanceof Person);

        System.out.println(terr instanceof Person);
        System.out.println(perr instanceof Singer);

        // super keyword
        teacher.eat();

    }
}
