package loopAssignment;

import java.util.Scanner;

public class LargestNumberFinderSNE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int inputNumber;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter a number (-1 to stop): ");
            inputNumber = scanner.nextInt();
            if (inputNumber > largestNumber) {
                largestNumber = inputNumber;
            }
        }
        System.out.println("The largest number entered is: " + largestNumber);
        scanner.close();
    }
}
