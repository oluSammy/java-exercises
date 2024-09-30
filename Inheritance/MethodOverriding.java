class Animal {
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Cat makes sound");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
