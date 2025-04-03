package Arrays;

import java.util.Scanner;

public class ScoreBoard {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int students = scanner.nextInt();
            System.out.print("Enter the number of subjects: ");
            int subjects = scanner.nextInt();

            int[][] scores = new int[students][subjects];

            for (int i = 0; i < students; i++) {
                System.out.print("Enter scores for Student " + (i + 1) + " :");
                for (int j = 0; j < subjects; j++) {
                    scores[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < students; i++) {
                int total = 0;
                for (int j = 0; j < subjects; j++) {
                    total += scores[i][j];
                }
                double average = (double) total / subjects;
                System.out.println("Student " + (i + 1) + " - Total: " + total + ", Average: " + average);
            }
        }
    }
}
