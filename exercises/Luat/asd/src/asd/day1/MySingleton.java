package asd.day1;
public enum MySingleton {
    INSTANCE;
    private MySingleton() {
        System.out.println("Initiate the My Singleton");
    }
}

