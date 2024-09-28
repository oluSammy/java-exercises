package constructor.constructorOverloading;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }
}

public class overloadingDataType {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1.5, 2.5);

        System.out.println("Point 1: (" + point1.x + ", " + point1.y + ")");
        System.out.println("Point 2: (" + point2.x + ", " + point2.y + ")");
    }
}
