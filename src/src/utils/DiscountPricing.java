package utils;
import utils.PricingStrategy;

public class DiscountPricing implements PricingStrategy {
    private final double discountPercentage;

    public DiscountPricing(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * (1 - discountPercentage / 100);
    }
}