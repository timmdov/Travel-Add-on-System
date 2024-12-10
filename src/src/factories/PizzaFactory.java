package factories;

import interfaces.Product;
import models.Pizza;

public class PizzaFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Pizza();
    }
}