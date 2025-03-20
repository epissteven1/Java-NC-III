package loopAssignment;

import java.util.Scanner;

public class GuessingGameSNE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 50) + 1;
        int inputNumber = 0;
        int attempts = 0;

        while (inputNumber != randomNumber) {
            System.out.print("Guess a number between 1 and 50: ");
            inputNumber = scanner.nextInt();
            attempts++;
            if (inputNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (inputNumber > randomNumber) {
                System.out.println("Too high! Try again");
            }
        }

        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
        scanner.close();
    }
}
