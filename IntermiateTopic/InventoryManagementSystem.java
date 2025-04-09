package IntermiateTopic;

// Inventory Management System in Java
// This program allows users to add, view, update, and delete products in an inventory.
// It uses a HashMap to store product information, where the key is the product ID and the value is a Product object.
// The Product class contains the product name and ID.
// The program provides a simple command-line interface for user interaction.
// The user can choose from a menu of options to perform various operations on the inventory.
// The program continues to run until the user chooses to exit.
// The program is designed to be simple and easy to understand, making it suitable for beginners learning Java.
import java.util.HashMap;
import java.util.Scanner;

class Product {
    String name;
    Integer productID;
}

public class InventoryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Exit");
        do {

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    private static void addProduct() {
        Product product = new Product();
        System.out.print("Enter Product ID: ");
        product.productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        product.name = scanner.nextLine();
        inventory.put(product.productID, product);
        System.out.println("Product added successfully!");
        System.out.println();
    }

    private static void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println("Enter new Product Name: " + product.productID + " " + product.name);
                System.out.println();
            }
        }
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        if (inventory.containsKey(productID)) {
            Product product = inventory.get(productID);
            System.out.print("Enter new Product Name: ");
            product.name = scanner.nextLine();
            System.out.println("Product updated successfully!");
            System.out.println();
        } else {
            System.out.println("Product not found!");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int productID = scanner.nextInt();
        if (inventory.containsKey(productID)) {
            inventory.remove(productID);
            System.out.println("Product deleted successfully!");
            System.out.println();
        } else {
            System.out.println("Product not found!");
        }
    }

}
