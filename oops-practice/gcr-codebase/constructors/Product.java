class Product{
    // Instance variables
    String productName;
    double price;
    // Class variable
    static int totalProducts=0;
    // Constructor to initialize product details
    Product(String name,double p){
        productName=name;
        price=p;
        totalProducts++;
    }
    // Instance method to display product details
    void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: ₹"+price);
        System.out.println();
    }
    // Class method to display total products
    static void displayTotalProducts(){
        System.out.println("Total Products Created: "+totalProducts);
    }
    public static void main(String[] args){
        Product p1=new Product("Laptop",55000);
        Product p2=new Product("Mobile",25000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
