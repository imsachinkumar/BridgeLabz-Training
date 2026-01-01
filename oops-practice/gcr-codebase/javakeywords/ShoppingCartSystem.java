class Product{
    // static discount shared by all products
    static double discount=10.0;
    final String productID;
    String productName;
    double price;
    int quantity;
    // constructor using this keyword
    Product(String productID,String productName,double price,int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    // static method to update discount
    static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }
    // method to calculate discounted price
    double getDiscountedPrice(){
        return price-(price*discount/100);
    }
    void displayDetails(Object obj){
        if(obj instanceof Product){
            System.out.println("Product ID: "+productID);
            System.out.println("Product Name: "+productName);
            System.out.println("Price: $"+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Price after Discount: $"+getDiscountedPrice());
        }
    }
}
public class ShoppingCartSystem{
    public static void main(String[] args){
        Product p1=new Product("P001","Laptop",1200.0,5);
        Product p2=new Product("P002","Smartphone",800.0,10);
        p1.displayDetails(p1);
        System.out.println();
        p2.displayDetails(p2);
    }
}
