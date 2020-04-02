package conditional;
public class Loops {
    public static void main(String[] args){
        int rating = 2;
        switch (rating){
            case 1:
            case 2:
                System.out.println("Good rating");
                break;
            case 3:
                System.out.println("average rating");
                break;
            case 4:
            case 5:
                System.out.println("bad rating");
                break;
            default:
                System.out.println("invalid user");
        }
    }
}
