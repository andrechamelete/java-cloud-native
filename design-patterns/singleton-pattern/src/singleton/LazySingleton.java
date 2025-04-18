package singleton;

public class LazySingleton {
    private static LazySingleton instance;

    LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if(instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}