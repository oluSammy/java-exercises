package constructor.constructorChaining;

class Student {
    String studentId;
    String studentName;
    int grade;

    Student() {
        this("unknown", "unknown", 0);
    }

    Student(String studentId, String studentName, int grade) {
        // this(studentId, studentName, grade);
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class constructorChaining {
    public static void main(String args[]) {
        Student student1 = new Student();
        Student student2 = new Student("123456", "John Doe", 10);

        System.out.println(student1.studentId);
        System.out.println(student1.studentName);
        System.out.println(student1.grade);

        System.out.println(student2.studentId);
        System.out.println(student2.studentName);
        System.out.println(student2.grade);
    }
}
