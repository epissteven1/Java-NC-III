package IntermiateTopic;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;
}

public class StudentGradeManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Update Grade");
        System.out.println("4. Remove Student");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentGrade();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);

        System.out.println("Student added!");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student.name + " - " + student.grade);
        }
    }

    private static void updateStudentGrade() {
        System.out.print("Enter student name to update grade: ");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                scanner.nextLine();

                student.grade = newGrade;
                System.out.println("Grade updated!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();

        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                students.remove(student);
                System.out.println("Student removed!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
