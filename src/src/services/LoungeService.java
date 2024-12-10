package services;
import interfaces.Product;
import interfaces.Ticket;
import models.CompositeProduct;
import java.util.ArrayList;
import java.util.List;


public class LoungeService {
    private static LoungeService instance;

    private final List<Ticket> tickets = new ArrayList<>();
    private final List<Product> orders = new ArrayList<>();

    private LoungeService() {}

    public static LoungeService getInstance() {
        if (instance == null) {
            instance = new LoungeService();
        }
        return instance;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void addOrder(Product order) {
        orders.add(order);
    }

    public double calculateTotalTicketCost() {
        return tickets.stream().mapToDouble(Ticket::getPrice).sum();
    }

    public double calculateTotalOrderCost() {
        return orders.stream().mapToDouble(Product::getPrice).sum();
    }

    public double calculateTotalCost() {
        return calculateTotalTicketCost() + calculateTotalOrderCost();
    }

    public void displaySummary() {
        System.out.println("===== Lounge Service Summary =====");

        System.out.println("Tickets:");
        tickets.forEach(ticket -> System.out.println("- " + ticket.getDescription() + ": $" + ticket.getPrice()));

        System.out.println("\nOrders:");
        orders.forEach(order -> System.out.println("- " + order.getDescription() + ": $" + order.getPrice()));

        System.out.println("\nTotal Ticket Cost: $" + calculateTotalTicketCost());
        System.out.println("Total Order Cost: $" + calculateTotalOrderCost());
        System.out.println("Overall Total Cost: $" + calculateTotalCost());

        System.out.println("===================================");
    }
}