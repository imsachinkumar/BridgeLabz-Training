package hotelreservationsystem;

// Normal season pricing
public class RegularPricing implements PricingStrategy {
    @Override
    public double calculateBill(double basePrice, int days) {
        return basePrice * days;
    }
}
