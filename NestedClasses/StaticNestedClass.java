package NestedClasses;

class MathUtil {

    static class Calculator {
        static int add(int a, int b) {
            return a + b;
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        int result = MathUtil.Calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}
