package NestedClasses;

class House {
    public int calculateArea(int length, int breadth) {
        class Room {
            int getArea() {
                return length * breadth;
            }
        }
        Room room = new Room();
        return room.getArea();
    }
}

public class LocalClassAccess {
    public static void main(String[] args) {
        House house = new House();
        int area = house.calculateArea(100, 200);
        System.out.println("Area: " + area);
    }
}
