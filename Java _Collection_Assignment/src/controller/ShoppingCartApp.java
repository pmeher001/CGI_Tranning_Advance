package controller;

import java.util.Scanner;
import model.Product;
import service.CartService;

public class ShoppingCartApp {
    public static void main(String[] args) {
        CartService cartService = new CartService();
        Scanner sc = new Scanner(System.in);

        // Sample Products
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Phone", 25000);
        Product p3 = new Product(3, "Headphones", 3000);

        while (true) {
            System.out.println("\n=== Shopping Cart Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. Update Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    System.out.println(p1);
                    System.out.println(p2);
                    System.out.println(p3);
                    System.out.print("Enter product ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (id == 1) cartService.addProduct(p1, qty);
                    else if (id == 2) cartService.addProduct(p2, qty);
                    else if (id == 3) cartService.addProduct(p3, qty);
                    else System.out.println("Invalid product ID!");
                    break;

                case 2:
                    System.out.print("Enter product ID to update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    cartService.updateProductQuantity(uid, newQty);
                    break;

                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int rid = sc.nextInt();
                    cartService.removeProduct(rid);
                    break;

                case 4:
                    cartService.showCart();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
