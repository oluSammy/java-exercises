package Inheritance;

class Motor {
    void drive(){
        System.out.println("Driving vehicle");
    }
}

class Car extends Motor {
    void drive(){
        System.out.println("Repairing a car");
    }
}

public class Vehicle {
    public static void main(String args[]) {
        Car car = new Car();
        car.drive();
    }
}

