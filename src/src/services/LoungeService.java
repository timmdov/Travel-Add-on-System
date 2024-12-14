package services;

import interfaces.*;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class LoungeService {
    private static LoungeService instance;
    private Ticket ticket;
    private final List<Product> products;

    private LoungeService() {
        this.ticket = new EconomyTicket();
        this.products = new ArrayList<>();
    }

    public static LoungeService getInstance() {
        if (instance == null) {
            instance = new LoungeService();
        }
        return instance;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // ==== Add Product ====
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public void displaySummary() {
        System.out.println("\n===== Lounge Service Summary =====");
        System.out.println("Ticket:");
        System.out.println("- " + ticket.getDescription() + ": $" + ticket.getPrice());
        System.out.println("\nOrders:");
        if (products.isEmpty()) {
            System.out.println("- No products ordered.");
        } else {
            for (Product product : products) {
                System.out.println("- " + product.getDescription() + ": $" + product.getPrice());
            }
        }
        double totalCost = ticket.getPrice() + products.stream().mapToDouble(Product::getPrice).sum();
        System.out.printf("\nTotal Cost: $%.2f%n", totalCost);
        System.out.println("===========================");
    }
}