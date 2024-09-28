package StaticMembers;

class ComplexInitializer {
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 5;
        y = 10;
        z = calculateZ(x, y);
    }
    
    public void print() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }
}

public class StaticBlockComplexInteraction {
    public static void main(String[] args) {
        ComplexInitializer ci = new ComplexInitializer();
        ci.print();
    }
}

