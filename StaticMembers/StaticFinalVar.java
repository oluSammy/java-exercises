package StaticMembers;

class Constants {
    public static final double PI = 3.14159;

    public double getArea(double radius) {
        return Constants.PI * radius * radius;
    }
}

public class StaticFinalVar {
    public static void main(String[] args) {
        System.out.println("PI: " + Constants.PI);
        System.out.println("Area: " + new Constants().getArea(10));
    }
}


