package app_test;

import decorators.pizzaDecorators.*;
import factories.*;
import interfaces.Product;

public class Main_pizzaTest {
    public static void main(String[] args) {
        ProductFactory pizzaFactory = new FEASPizzeriaFactory();
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
    }
}
