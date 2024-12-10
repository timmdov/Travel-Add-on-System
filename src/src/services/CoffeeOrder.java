package services;

public class CoffeeOrder extends OrderProcess {

    @Override
    protected void askPreferences() {
        System.out.println("Asking customer for coffee customizations...");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing coffee: Brewing and adding customizations.");
    }

    @Override
    protected void deliver() {
        System.out.println("Delivering the coffee to the customer.");
    }

    @Override
    protected void acceptPayment() {
        System.out.println("Accepting payment for the coffee order.");
    }
}