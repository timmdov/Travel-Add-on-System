package models;
import interfaces.Product;
import java.util.ArrayList;
import java.util.List;

public class CompositeProduct implements Product {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Composite Product: ");
        for (Product product : products) {
            description.append(product.getDescription()).append("; ");
        }
        return description.toString();
    }

    @Override
    public double getPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}