package services;

public class IceCreamOrder extends OrderProcess {

    @Override
    protected void askPreferences() {
        System.out.println("Asking customer for ice cream flavors and toppings...");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing ice cream: Scooping and adding toppings.");
    }

    @Override
    protected void deliver() {
        System.out.println("Delivering the ice cream to the customer.");
    }

    @Override
    protected void acceptPayment() {
        System.out.println("Accepting payment for the ice cream order.");
    }
}