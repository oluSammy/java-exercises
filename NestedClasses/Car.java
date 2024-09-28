package NestedClasses;

// Local Class

public class Car {
    public void startEngine() {
        class Engine {
            void run() {
                System.out.println("Engine is running");
            }
        }
        Engine engine = new Engine();
        engine.run();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
