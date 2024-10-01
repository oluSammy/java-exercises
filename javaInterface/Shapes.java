package javaInterface;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    public double getArea() {
        return 0.4;
    }
}

class Circle implements Shape {
    public double getArea() {
        return 0.4;
    }
}

class Triangle implements Shape {
    public double getArea() {
        return 0.4;
    }
}


public class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
