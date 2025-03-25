
package OOP;

import java.util.Scanner;

class Studens {
    String name;
    int[] grades;

    Students(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    String classifyGrade(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        double average = calculateAverage();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + classifyGrade(average));
    }
}

public class studentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of grades: ");
        int numGrades = scanner.nextInt();
        int[] grades = new int[numGrades];

        System.out.print("Enter " + numGrades + " grades: ");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = scanner.nextInt();
        }

        Student student = new Student(name, grades);
        student.displayInfo();

        scanner.close();
    }
}