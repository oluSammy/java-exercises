package NestedClasses;

class University {

    static class Department {
        String departmentName;
        int noOfFacultyMembers;

        Department(String departmentName, int noOfFacultyMembers) {
            this.departmentName = departmentName;
            this.noOfFacultyMembers = noOfFacultyMembers;
        }

        void displayDepartment() {
            System.out.println("Department: " + this.departmentName + " " + this.noOfFacultyMembers);
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        University.Department department = new University.Department("Computer Science", 10);
        department.displayDepartment();
    }
}