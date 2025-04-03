package IntermiateTopic;

import java.util.Scanner;

public class SafeArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.print("Enter an index to access (0-4): ");
        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
