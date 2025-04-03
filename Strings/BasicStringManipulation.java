package Strings;

import java.util.Scanner;

public class BasicStringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String Fullname = scanner.nextLine();

        System.out.print("Uppercase Name: " + Fullname.toUpperCase() + "\n");

        String nameWithoutSpaces = Fullname.replace(" ", "");
        int length = nameWithoutSpaces.length();

        System.out.println("Total Characters (excluding spaces): " + length);

        String[] nameParts = Fullname.split(" ");
        System.out.print("Initials: ");
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                System.out.print(part.charAt(0) + ".");
            }
        }
        System.out.println();

        scanner.close();
    }
}
