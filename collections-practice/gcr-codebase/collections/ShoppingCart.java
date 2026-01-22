import java.util.*;
public class ShoppingCart {
    // HashMap → product and price
    static Map<String, Integer> priceMap = new HashMap<>();
    // LinkedHashMap → order of items added to cart
    static Map<String, Integer> cartMap = new LinkedHashMap<>();

    public static void addProduct(String product, int price) {
        priceMap.put(product, price);
    }

    //add item to cart
    public static void addToCart(String product) {
        if (priceMap.containsKey(product)) {
            cartMap.put(product, priceMap.get(product));
        } else {
            System.out.println("Product not found: " + product);
        }
    }
    public static void displayCart() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    public static void displayCartSortedByPrice() {

        // TreeMap sorted by price
        TreeMap<Integer, List<String>> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cartMap.entrySet()) {
            int price = entry.getValue();
            String product = entry.getKey();

            sortedMap.putIfAbsent(price, new ArrayList<>());
            sortedMap.get(price).add(product);
        }

        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Integer, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> ₹" + entry.getKey());
            }
        }
    }
    public static void main(String[] args) {

        // Add products with prices
        addProduct("Laptop", 60000);
        addProduct("Mouse", 800);
        addProduct("Keyboard", 1500);
        addProduct("Headphones", 2500);

        // Add items to cart
        addToCart("Laptop");
        addToCart("Mouse");
        addToCart("Headphones");
        addToCart("Keyboard");

        // Display cart
        displayCart();

        // Display sorted cart
        displayCartSortedByPrice();
    }
}
