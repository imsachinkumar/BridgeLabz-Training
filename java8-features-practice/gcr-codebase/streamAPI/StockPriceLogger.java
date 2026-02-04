import java.util.*;
public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(1250.50, 1265.75, 1240.30, 1278.90);

        // Print stock prices
        stockPrices.forEach(price ->
            System.out.println("Stock Price Update: " + price)
        );
    }
}
