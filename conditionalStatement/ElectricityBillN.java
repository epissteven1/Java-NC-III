package conditionalStatement;

import java.util.Scanner;

public class ElectricityBillN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int unitConsumed = scanner.nextInt();
        double totalBill = 0.0;

        if (unitConsumed <= 100) {
            totalBill = unitConsumed * 1.50;
        } else if (unitConsumed <= 300) {
            totalBill = 100 * 1.50 + (unitConsumed - 100) * 2.50;
        } else {
            totalBill = 100 * 1.50 + 200 * 2.50 + (unitConsumed - 300) * 3.50;
        }

        System.out.println("Total bill: " + totalBill);
        scanner.close();
    }
}
