package models;
import interfaces.Product;

public class Coffee implements Product {
    @Override
    public String getDescription() {
        return "Iced Americano";
    }
    @Override
    public double getPrice() {
        return 3.00;
    }
}