package constructor.ParameterizedConstructor;

class Dog {
    String name;
    String color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.color);
    }
}


class ParameterizedConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("Rottweiler", "white");
        dog.display();
    }
}