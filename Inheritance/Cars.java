package Inheritance;

interface VehicleInterface {
    void fuelEfficiency();
    void distanceTraveled();
    void maxSpeed();
}

abstract class Vehicle implements VehicleInterface {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract void fuelEfficiency();
    public abstract void distanceTraveled();
    public abstract void maxSpeed();

}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void fuelEfficiency() {
        System.out.println("Truck fuel efficiency");
    }

    public void distanceTraveled() {
        System.out.println("Truck distance traveled");
    }

    public void maxSpeed() {
        System.out.println("Truck max speed");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void fuelEfficiency() {
        System.out.println("Car fuel efficiency");
    }

    public void distanceTraveled() {
        System.out.println("Car distance traveled");
    }

    public void maxSpeed() {
        System.out.println("Car max speed");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void fuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency");
    }

    public void distanceTraveled() {
        System.out.println("Motorcycle distance traveled");
    }

    public void maxSpeed() {
        System.out.println("Motorcycle max speed");
    }
}

public class Cars {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2024, "Gasoline");
        Car car = new Car("Toyota", "Corolla", 2024, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2024, "Gasoline");

        truck.fuelEfficiency();
        truck.distanceTraveled();
        truck.maxSpeed();

        car.fuelEfficiency();
        car.distanceTraveled();
        car.maxSpeed();

        motorcycle.fuelEfficiency();
        motorcycle.distanceTraveled();
        motorcycle.maxSpeed();
    }
}
