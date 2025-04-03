package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;
    int id;

    public Student(String name, double grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public Student(String name2, int[] grades) {
        // TODO Auto-generated constructor stub
    }

    public void displayInfo() {

        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
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

        System.out.print("Enter student ID: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer ID.");
            scanner.next();
        }
        int id = scanner.nextInt();

        System.out.print("Enter student grade: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid grade.");
            scanner.next();
        }
        double grade = scanner.nextDouble();
        scanner.nextLine();

        students.add(new Student(name, grade, id));
        System.out.println("Student added successfully!");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("--- Student Records ---");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("ID: " + student.id);
            System.out.println("Grade: " + student.grade);
            System.out.println();
        }
    }

    private static void updateStudentGrade() {
        System.out.print("Enter student ID to update: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer ID.");
            scanner.next();
        }
        int id = scanner.nextInt();

        System.out.print("Enter new grade: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid grade.");
            scanner.next();
        }
        double newGrade = scanner.nextDouble();
        scanner.nextLine();

        for (Student student : students) {
            if (student.id == id) {
                student.grade = newGrade;
                System.out.println("Grade updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
