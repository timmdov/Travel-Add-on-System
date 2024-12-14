package app_test;

import decorators.iceCreamDecorators.*;
import factories.*;
import interfaces.Product;

public class Main_iceCreamTest {
    public static void main(String[] args) {
        SCOLAIceCreamFactory iceCreamFactory = new SCOLAIceCreamFactory();
        Product iceCream = iceCreamFactory.createProduct();
        System.out.println("Ice Cream Description: " + iceCream.getDescription());
        System.out.println("Ice Cream Price" + " - $" + iceCream.getPrice());
        System.out.println(" ");

        iceCream = new VanillaScoop(iceCream);
        System.out.println("Ice Cream Description: " + iceCream.getDescription());
        System.out.println("Ice Cream Price" + " - $" + iceCream.getPrice());
        System.out.println(" ");

        iceCream = new VanillaScoop(iceCream);
        System.out.println("Ice Cream Description: " + iceCream.getDescription());
        System.out.println("Ice Cream Price" + " - $" + iceCream.getPrice());
        System.out.println(" ");

        iceCream = new ChocolateScoop(iceCream);
        System.out.println("Ice Cream Description: " + iceCream.getDescription());
        System.out.println("Ice Cream Price" + " - $" + iceCream.getPrice());
        System.out.println(" ");
    }
}
