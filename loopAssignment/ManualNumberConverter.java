package loopAssignment;

import java.util.Scanner;

public class ManualNumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        String binary = convertToBase(number, 2);
        String octal = convertToBase(number, 8);
        String hexadecimal = convertToBase(number, 16);

        System.out.println("\n=== Number System Conversions ===");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }

    private static String convertToBase(int number, int base) {
        String digits = "0123456789ABCDEF";
        String result = "";
        while (number > 0) {
            int remainder = number % base;
            result = digits.charAt(remainder) + result;
            number = number / base;
        }
        return result;
    }
}
