package Arrays;

import java.util.Scanner;

public class StudentGradesAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        int sum = 0;

        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
            sum += grade;
        }

        double averageGrade = (double) sum / numberOfStudents;

        System.out.println("\nHighest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        System.out.println("Average Grade: " + averageGrade);

        scanner.close();
    }
}
