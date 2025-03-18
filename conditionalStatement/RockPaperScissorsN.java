package conditionalStatement;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your choice (R, P, S): ");
        char userChoice = scanner.next().toUpperCase().charAt(0);

        int computerChoiceInt = random.nextInt(3);
        char computerChoice = ' ';
        switch (computerChoiceInt) {
            case 0:
                computerChoice = 'R';
                break;
            case 1:
                computerChoice = 'P';
                break;
            case 2:
                computerChoice = 'S';
                break;
        }

        System.out.println("Computer chose: " + computerChoice);

        switch (userChoice) {
            case 'R':
                if (computerChoice == 'R') {
                    System.out.println("It's a tie!");
                } else if (computerChoice == 'P') {
                    System.out.println("You lose!");
                } else {
                    System.out.println("You win!");
                }
                break;
            case 'P':
                if (computerChoice == 'R') {
                    System.out.println("You win!");
                } else if (computerChoice == 'P') {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("You lose!");
                }
                break;
            case 'S':
                if (computerChoice == 'R') {
                    System.out.println("You lose!");
                } else if (computerChoice == 'P') {
                    System.out.println("You win!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            default:
                System.out.println("Invalid input! Please enter R, P, or S.");
        }

        scanner.close();
    }
}
