package loopAssignment;

import java.util.Scanner;

public class SumOfNumbersN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int positiveNum = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= positiveNum) {
            sum += i;
            i++;
        }
        System.out.print("The sum of natural numbers from 1 to " + positiveNum + " is: " + sum);
        scanner.close();
    }

}
