package StaticMembers;

class Initializer {
    static int initializer;

    static {
        initializer = 1000;
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Initializer: " + Initializer.initializer);
        Initializer initializer = new Initializer();
        System.out.println("Initializer: " + Initializer.initializer);
    }
}
