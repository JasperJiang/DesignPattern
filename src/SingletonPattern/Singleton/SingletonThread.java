package SingletonPattern.Singleton;

public class SingletonThread implements Runnable {
    private String name;

    public SingletonThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " start");
            Singleton.getInstance();
            Singleton2.getInstance();
            Thread.sleep(50);
            System.out.println("Thread " + name + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
