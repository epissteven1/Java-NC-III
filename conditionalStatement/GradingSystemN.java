package conditionalStatement;

import java.util.Scanner;

public class GradingSystemN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
            System.out.println("Feedback: Excellent!");
        } else if (score >= 75) {
            System.out.println("Grade: B");
            System.out.println("Feedback: Good job!");
        } else if (score >= 50) {
            System.out.println("Grade: C");
            System.out.println("Feedback: You can do better!");
        } else {
            System.out.println("Grade: F");
            System.out.println("Feedback: Try Harder.");
        }

        scanner.close();
    }
}
