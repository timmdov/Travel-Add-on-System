package services;

public class PizzaOrder extends OrderProcess {

    @Override
    protected void askPreferences() {
        System.out.println("Asking customer for pizza toppings...");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza: Adding toppings and baking.");
    }

    @Override
    protected void deliver() {
        System.out.println("Delivering the pizza to the customer's table.");
    }

    @Override
    protected void acceptPayment() {
        System.out.println("Accepting payment for the pizza order.");
    }
}