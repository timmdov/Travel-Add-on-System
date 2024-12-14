package app_test;

import decorators.coffeeDecorators.*;
import factories.*;
import interfaces.Product;

public class Main_coffeeTest {
    public static void main(String[] args) {
        ProductFactory coffeeFactory = new EFCoffeeFactory();
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
