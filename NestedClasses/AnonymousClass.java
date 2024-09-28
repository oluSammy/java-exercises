package NestedClasses;

interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        new Greeting() {
            public void sayHello() {
                System.out.println("Hello world...");
            }
        }.sayHello();
    }
}
