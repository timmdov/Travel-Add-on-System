package models;

import interfaces.Product;

public class Pizza implements Product {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }
    @Override
    public double getPrice() {
        return 5.00;
    }
}