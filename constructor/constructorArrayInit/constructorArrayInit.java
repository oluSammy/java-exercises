package constructor.constructorArrayInit;

class ClassRoom {
    String[] students;
    String className;

    ClassRoom(String[] students, String className) {
        this.students = students;
        this.className = className;
    }

    public void display() {
        System.out.println("Class Name: " + className);
        System.out.println("Students:");

        for (int i = 0; i < this.students.length; i++) {
            System.out.println(this.students[i]);
        }
    }
}

public class constructorArrayInit {
    public static void main(String[] args) {
        String[] students = {"John", "Jane", "Doe"};
        ClassRoom classRoom = new ClassRoom(students, "Math");
        classRoom.display();
    }
}

