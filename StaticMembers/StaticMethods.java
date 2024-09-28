package StaticMembers;

class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}

class StaticMethods {
    public static void main(String[] args) {
        System.out.println("10 + 5 = " + MathUtility.add(10, 5));
        System.out.println("10 - 5 = " + MathUtility.subtract(10, 5));
    }
}


