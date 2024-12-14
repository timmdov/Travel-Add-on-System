package app;

import decorators.coffeeDecorators.*;
import decorators.pizzaDecorators.*;
import decorators.iceCreamDecorators.*;
import decorators.ticketDecorators.*;
import interfaces.*;
import models.*;
import services.LoungeService;

public class Main {
    public static void main(String[] args) {
        LoungeService loungeService = LoungeService.getInstance();

        Ticket ticket = new EconomyTicket();
        ticket = new ExtraLegRoom(ticket);
        ticket = new TheOzuExperience(ticket);
        loungeService.setTicket(ticket);

        Product iceCream = new IceCream();
        iceCream = new VanillaScoop(iceCream);
        iceCream = new ChocolateScoop(iceCream);
        loungeService.addProduct(iceCream);

        Product pizza = new Pizza();
        pizza = new Jalapeno(pizza);
        pizza = new Salami(pizza);
        loungeService.addProduct(pizza);

        Product coffee = new Coffee();
        coffee = new ExtraEspressoShot(coffee);
        loungeService.addProduct(coffee);

        loungeService.displaySummary();
    }
}