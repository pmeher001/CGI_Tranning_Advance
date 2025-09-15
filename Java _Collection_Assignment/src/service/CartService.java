package service;

import java.util.*;
import model.CartItem;
import model.Product;

public class CartService {
    private Map<Integer, CartItem> cart = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (cart.containsKey(product.getId())) {
            CartItem existing = cart.get(product.getId());
            existing.setQuantity(existing.getQuantity() + quantity);
        } else {
            cart.put(product.getId(), new CartItem(product, quantity));
        }
    }

    public void updateProductQuantity(int productId, int quantity) {
        if (cart.containsKey(productId)) {
            cart.get(productId).setQuantity(quantity);
        } else {
            System.out.println("Product not found in cart!");
        }
    }

    public void removeProduct(int productId) {
        cart.remove(productId);
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cart.values()) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : cart.values()) {
                System.out.println(item);
            }
            System.out.println("Total: $" + calculateTotal());
        }
    }
}
