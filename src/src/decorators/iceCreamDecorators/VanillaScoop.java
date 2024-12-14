package decorators.iceCreamDecorators;

import decorators.iceCreamDecorators.IceCreamDecorator;
import interfaces.Product;

public class VanillaScoop extends IceCreamDecorator {
    public VanillaScoop(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {return product.getDescription() + ", Vanilla Scoop";}

    @Override
    public double getPrice() {return product.getPrice() + 0.50;}

}
