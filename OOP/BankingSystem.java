
/* I am using the same code as the one in the question, but I have added a few more functionalities to it.
I have added a transaction history to the BankAccount class, and I have added the following options to the main menu:
1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit
The user can now view the transaction history of an account by selecting option 6 from the main menu.
The transaction history will display all the transactions that have been made on the account, including deposits, withdrawals, and interest applied.
 */

package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;
    private ArrayList<String> transactionHistory;

    public BankAccount() {
        transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number. It must be exactly 10 numeric characters.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance");
            return;
        }
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }
}

public class BankingSystem {
    private static ArrayList<BankAccount> bankAccount = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Secure Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    applyInterest();
                    break;
                case 6:
                    viewTransactionHistory();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void createAccount() {
        BankAccount account = new BankAccount();
        System.out.print("Enter Account Number (10 digits) ");
        String accountNumber = scanner.nextLine();
        account.setAccountNumber(accountNumber);

        if (account.getAccountNumber() == null) {
            System.out.println("Account creation failed due to invalid account number.");
            return;
        }

        System.out.print("Enter account holder: ");
        String accountHolder = scanner.nextLine();
        account.setAccountHolder(accountHolder);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        account.setBalance(balance);
        account.addTransaction("Initial deposit: $" + balance);

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        account.setInterestRate(interestRate);

        bankAccount.add(account);
        System.out.println("Account created successfully!");
    }

    public static void viewAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : bankAccount) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("--- Account Details ---");
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Holder: " + account.getAccountHolder());
                System.out.println("Balance: $" + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : bankAccount) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.setBalance(account.getBalance() + amount);
                account.addTransaction("Deposit: $" + amount);
                System.out.println("Deposit successful. New Balance: $" + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : bankAccount) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                if (account.getBalance() < amount) {
                    System.out.println("Insufficient funds.");
                    return;
                }
                account.setBalance(account.getBalance() - amount);
                account.addTransaction("Withdrawal: $" + amount);
                System.out.println("Withdrawal successful. New Balance: $" + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void applyInterest() {
        for (BankAccount account : bankAccount) {
            double interest = account.getBalance() * (account.getInterestRate() / 100);
            account.setBalance(account.getBalance() + interest);
            account.addTransaction("Interest Applied: $" + interest);
            System.out.println("Interest applied to account number: " + account.getAccountNumber());
        }
    }

    public static void viewTransactionHistory() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : bankAccount) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("--- Transaction History ---");
                for (String transaction : account.getTransactionHistory()) {
                    System.out.println(transaction);
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
