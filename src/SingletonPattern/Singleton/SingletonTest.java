package SingletonPattern.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        SingletonThread singletonThread = new SingletonThread("1");
        Thread thread = new Thread(singletonThread);
        thread.start();
        SingletonThread singletonThread2 = new SingletonThread("2");
        Thread thread2 = new Thread(singletonThread2);
        thread2.start();

    }
}
