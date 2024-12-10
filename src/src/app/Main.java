package app;
import decorators.*;
import interfaces.Ticket;
import interfaces.Product;
import models.EconomyTicket;
import factories.ProductFactory;
import factories.PizzaFactory;
import factories.CoffeeFactory;


public class Main {
    public static void main(String[] args) {
        Ticket ticket = new EconomyTicket();
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new ExtraLegRoom(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new EmergencyExit(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new TheOzuExperience(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ProductFactory pizzaFactory = new PizzaFactory();
        Product pizza = pizzaFactory.createProduct();
        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Pizza Price" + " - $" + pizza.getPrice());
        System.out.println(" ");

        pizza = new Salami(pizza);
        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Pizza Price" + " - $" + pizza.getPrice());
        System.out.println(" ");

        pizza = new Jalapeno(pizza);
        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Pizza Price" + " - $" + pizza.getPrice());
        System.out.println(" ");

        ProductFactory coffeeFactory = new CoffeeFactory();
        Product coffee = coffeeFactory.createProduct();
        System.out.println("Coffee Description: " + coffee.getDescription());
        System.out.println("Coffee Price" + " - $" + coffee.getPrice());
        System.out.println(" ");

        coffee = new ExtraEspressoShot(coffee);
        System.out.println("Coffee Description: " + coffee.getDescription());
        System.out.println("Coffee Price" + " - $" + coffee.getPrice());
        System.out.println(" ");

        coffee = new ExtraEspressoShot(coffee);
        System.out.println("Coffee Description: " + coffee.getDescription());
        System.out.println("Coffee Price" + " - $" + coffee.getPrice());
        System.out.println(" ");
    }
}