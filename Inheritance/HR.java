package Inheritance;

class Employee {
    void work() {
        System.out.println("Working...");
    }

    void getSalary() {
        System.out.println("Salary: 100000");
    }
}

class HrManager extends Employee {
    @Override
    void work() {
        System.out.println("Working for the Hr manager");
    }

    void addEmployee() {
        System.out.println("Adding employee...");
    }
}

public class HR {
    public static void main(String args[]) {
        HrManager hrManager = new HrManager();
        hrManager.work();
        hrManager.getSalary();
        hrManager.addEmployee();
    }
}
