package SingletonPattern.Singleton;

public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){
        System.out.println("new object");
    }

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}
