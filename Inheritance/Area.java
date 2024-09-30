package Inheritance;

class Shape {
    public int getArea(int length, int width) {
        System.out.println("Area of rectangle: " + length * width);
        return length * width;
    }
}

class Rectangle extends Shape {
    public int getArea(int length, int width) {
        System.out.println("Area of rectangle: " + length * width);
        return length * width;
    }
}

public class Area {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(10, 20);
    }
}
