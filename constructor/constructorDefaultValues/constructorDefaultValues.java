package constructor.constructorDefaultValues;

class Car {
    String make;
    String model;
    int year;

    Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

public class constructorDefaultValues {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Corolla", 2020);

        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
    }
}
