package OOP;
/*
 Create an interface named PaymentMethod with a method named processPayment that accepts a double amount.
Create classes CreditCard, PayPal, and CryptoWallet that implement the PaymentMethod interface.
The processPayment method of CreditCard should print "Processing credit card payment of $amount".
The processPayment method of PayPal should print "Processing PayPal payment of $amount".
The processPayment method of CryptoWallet should print "Processing cryptocurrency payment of $amount".

In the main method of the Payment class, ask the user to choose a payment method (1: Credit Card, 2: PayPal, 3: CryptoWallet).
 */

import java.util.Scanner;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.print("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.print("Processing PayPal payment of $" + amount);
    }
}

class CryptoWallet implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.print("Processing cryptocurrency payment of $" + amount);
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose payment method (1: Credit Card, 2: PayPal, 3: CryptoWallet): ");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod;

        if (choice == 1) {
            paymentMethod = new CreditCard();
        } else if (choice == 2) {
            paymentMethod = new PayPal();
        } else if (choice == 3) {
            paymentMethod = new CryptoWallet();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        paymentMethod.processPayment(amount);

        scanner.close();
    }
}
