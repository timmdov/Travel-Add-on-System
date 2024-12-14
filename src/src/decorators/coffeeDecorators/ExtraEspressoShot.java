package decorators.coffeeDecorators;
import decorators.coffeeDecorators.CoffeeDecorator;
import interfaces.Product;



public class ExtraEspressoShot extends CoffeeDecorator {
    public ExtraEspressoShot(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Extra Espresso Shot";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 0.50;
    }
}