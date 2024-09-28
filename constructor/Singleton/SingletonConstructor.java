package constructor.Singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton constructor called");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Singleton instance created");
        }
        System.out.println("Singleton instance returned");
        return instance;
    }
}


public class SingletonConstructor {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }
}
