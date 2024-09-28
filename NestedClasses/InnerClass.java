package NestedClasses;

class Computer {

    class Processor {
        String brand;
        int speed;

        Processor(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }


        void displayProcessor() {
            System.out.println("Processor: " + brand + " " + speed);
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor("Intel", 3);
        processor.displayProcessor();
    }
}
