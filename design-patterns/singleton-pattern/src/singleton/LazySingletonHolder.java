package singleton;

public class LazySingletonHolder {

    private static class Holder {
        public static LazySingletonHolder instance = new LazySingletonHolder();
    }

    private LazySingletonHolder() {
        super();
    }

    public static LazySingletonHolder getInstance() {
        return Holder.instance;
    }
}