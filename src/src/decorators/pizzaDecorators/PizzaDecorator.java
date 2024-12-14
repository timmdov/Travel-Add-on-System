package decorators.pizzaDecorators;
import interfaces.Product;

public abstract class PizzaDecorator implements Product {
    protected Product product;

    public PizzaDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}