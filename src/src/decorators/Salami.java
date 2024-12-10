package decorators;
import interfaces.Product;

public class Salami extends ToppingDecorator {
    public Salami(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Salami";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 1.00;
    }
}