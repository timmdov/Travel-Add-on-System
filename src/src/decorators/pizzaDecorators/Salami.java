package decorators.pizzaDecorators;
import interfaces.Product;

public class Salami extends PizzaDecorator {
    public Salami(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Salami";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 0.50;
    }
}