package decorators.iceCreamDecorators;

import interfaces.Product;

public abstract class IceCreamDecorator implements Product {
    protected Product product;

    public IceCreamDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription(){
        return product.getDescription();
    }

    @Override
    public double getPrice(){
        return product.getPrice();
    }
}
