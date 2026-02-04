import java.util.*;
public class EcommerceSorting {

    static class Product {
        String name;
        double price;
        double rating;
        double discount;

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Mobile", 20000, 4.5, 10));
        products.add(new Product("Laptop", 50000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 20));

        // Sort by Price
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price:");
        print(products);

        // Sort by Rating
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        print(products);

        // Sort by Discount
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSorted by Discount:");
        print(products);
    }

    static void print(List<Product> list) {
        for (Product p : list) {
            System.out.println(p.name + " | Price: " + p.price + " | Rating: " + p.rating + " | Discount: " + p.discount + "%");
        }
    }
}
