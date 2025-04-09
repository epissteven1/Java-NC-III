package IntermiateTopic;

// This program demonstrates the use of a custom exception to enforce an age restriction for registration.
// If the user is under 18, an AgeRestrictionException is thrown with a message indicating the restriction.
// The exception is caught in the main method, and an error message is displayed to the user.
// The program uses a Scanner to read user input and handle exceptions appropriately.
// The custom exception class AgeRestrictionException extends the Exception class and provides a constructor to set the error message.
import java.util.Scanner;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class AgeVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new AgeRestrictionException("You must be at least 18 to register.");
            }
            System.out.println("Registration successful!");
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
