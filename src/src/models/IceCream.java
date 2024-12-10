package models;

import interfaces.Product;

public class IceCream implements Product {

    @Override
    public String getDescription() {
        return "Basic Ice cream";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}
