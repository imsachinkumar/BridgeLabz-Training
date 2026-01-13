package hotelreservationsystem;

// Interface for pricing calculation
public interface PricingStrategy {
    double calculateBill(double basePrice, int days);
}
