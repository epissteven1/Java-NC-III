package IntermiateTopic;

// This program demonstrates exception handling in Java.
// It takes two numbers as input and performs division, handling potential exceptions.
// It uses try-catch blocks to catch specific exceptions like ArithmeticException and InputMismatchException.
// The program also includes a finally block to close the scanner resource.
// The program is designed to be user-friendly and provides clear error messages for invalid inputs.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
