package OOPs.Interfaces;

public class Person implements  Student, YouTober{
    public static void main(String[] args){
        Person obj = new Person();
        obj.Study();
        obj.makeVideo();

        YouTober obj2 = obj;
        obj2.makeVideo();
        obj2.editVideos();
    }

    @Override
    public void Study(){
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("person is making a video");
    }

    @Override
    public void editVideos() {
        System.out.println("edit the videos");
    }
}

