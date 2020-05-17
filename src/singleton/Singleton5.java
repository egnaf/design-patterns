package singleton;

public class Singleton5 {

    private final static Singleton5 instance = new Singleton5();

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return instance;
    }
}
