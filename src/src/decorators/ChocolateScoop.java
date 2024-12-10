package decorators;

import interfaces.Product;

public class ChocolateScoop extends IceCreamDecorator{
    public ChocolateScoop(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {return product.getDescription() + ", Chocolate Scoop";}

    @Override
    public double getPrice() {return product.getPrice() + 0.50;}

}
