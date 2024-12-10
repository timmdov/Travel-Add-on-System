package decorators;
import interfaces.Product;

public abstract class CoffeeDecorator implements Product {
    protected Product product;

    public CoffeeDecorator(Product product) {
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