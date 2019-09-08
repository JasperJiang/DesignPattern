package SingletonPattern.Singleton;

public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    public Singleton2(){
        System.out.println("new object2");
    }

    public static Singleton2 getInstance(){
        return singleton2;
    }

}
