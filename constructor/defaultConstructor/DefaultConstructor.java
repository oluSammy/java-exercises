package constructor.defaultConstructor;

class Cat {
    String name;
    int age;

    Cat() {
        this.name = "unknown";
        this.age = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class DefaultConstructor {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
    }
}