package factories;
import interfaces.Product;
import models.IceCream;


public class SCOLAIceCreamFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new IceCream();
    }
}
