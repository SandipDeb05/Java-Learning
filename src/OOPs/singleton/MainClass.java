package OOPs.singleton;

public class MainClass {
    public static void main(String[] agrs){
//        AppConfig obj1 = new AppConfig(); // erros cos its default constructor is private
        AppConfig obj1 = AppConfig.getInstance(); // return obj
        AppConfig obj2 = AppConfig.getInstance(); // same obj will retun
        AppConfig obj3 = AppConfig.getInstance(); // same obj will return
    }
}
