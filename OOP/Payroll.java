package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class employee {
    String name;
    int employeeID;
    double salary;
    String department;

    public employee(String name, double salary, int id, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeID = id;

    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void calculateAnnualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + "$" + annualSalary);
    }
}

public class Payroll {
    private static ArrayList<employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Employee Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
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
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    raiseSalary();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        employee newEmployee = new employee(name, salary, id, department);
        employees.add(newEmployee);
        System.out.println("Employee added successfully.");
    }

    private static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("--- Employee Records ---");
        for (employee emp : employees) {
            System.out.println("Employee ID: " + emp.employeeID);
            System.out.println("Name: " + emp.name);
            System.out.println("Salary: " + "$" + emp.salary);
            System.out.println("Department: " + emp.department);
            System.out.println();
        }
    }

    private static void calculateAnnualSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees to calculate salary.");
            return;
        }
        System.out.println("--- Annual Salary Calculation ---");
        System.out.print("Enter employee ID to calculate salary: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (employee emp : employees) {
            if (emp.employeeID == id) {
                emp.calculateAnnualSalary();
                return;
            }
        }
    }

    private static void raiseSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees to give raise.");
            return;
        }
        System.out.println("--- Salary Raise ---");
        System.out.print("Enter employee ID to give raise: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (employee emp : employees) {
            if (emp.employeeID == id) {
                System.out.print("Enter raise percentage: ");
                double raisePercentage = scanner.nextDouble();
                scanner.nextLine();

                double newSalary = emp.salary + (emp.salary * raisePercentage / 100);
                emp.salary = newSalary;
                System.out.println("Salary updated successfully! New Salary:" + "$" + newSalary);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

}
