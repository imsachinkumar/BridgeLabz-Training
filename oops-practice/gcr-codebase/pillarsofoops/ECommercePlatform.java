import java.util.*;
//interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
//abstract class
abstract class Product {
    // Encapsulated fields
    private int productId;
    private String name;
    private double price;
    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    // Abstract method for discount calculation
    public abstract double calculateDiscount();
    // Getter methods (Encapsulation)
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    // Setter method
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    public void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Base Price : " + price);
    }
}
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    // 10% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
    // 18% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    // 20% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
    // 5% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }
    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }
    // 5% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class ECommercePlatform {
    //Polymorphic method
    public static void calculateFinalPrice(ArrayList<Product> products) {
        for (Product p : products) {
            double tax = 0;
            // Check if product is taxable
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            p.displayProduct();
            System.out.println("Discount   : " + discount);
            System.out.println("Tax        : " + tax);
            System.out.println("Final Price: " + finalPrice);
        }
    }
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Groceries(103, "Rice Bag", 1200);
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        // Polymorphic processing
        calculateFinalPrice(productList);
    }
}
