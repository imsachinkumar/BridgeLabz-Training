package hotelreservationsystem;

// Seasonal pricing (higher rates)
public class SeasonalPricing implements PricingStrategy {
    @Override
    public double calculateBill(double basePrice, int days) {
        return (basePrice * 1.5) * days;
    }
}
