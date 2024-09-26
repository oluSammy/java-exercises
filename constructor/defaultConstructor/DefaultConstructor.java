package constructor.defaultConstructor;

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class DefaultConstructor {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", 3);
        cat.display();
    }
}