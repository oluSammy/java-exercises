package StaticMembers;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void printCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter.printCount();
    }
}

