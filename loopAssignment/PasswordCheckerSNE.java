package loopAssignment;

import java.util.Scanner;

public class PasswordCheckerSNE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "java123";
        String inputPassword;
        do {
            System.out.print("Enter the password: ");
            inputPassword = scanner.nextLine();
            if (!inputPassword.equals(password)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!inputPassword.equals(password));
        System.out.println("Access granted!");
        scanner.close();
    }
}
