// Interface
interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
// Abstract class
abstract class FoodItem{
    private String name;
    protected double price;
    protected int qty;
    //Constructor
    FoodItem(String n,double p,int q){
        name=n;price=p;qty=q;
    }
    public void getItemDetails(){
        System.out.println(name+" | Qty:"+qty+" | Price:"+price);
    }
    abstract double calculateTotalPrice();
}
// Subclasses
class VegItem extends FoodItem implements Discountable{
    VegItem(String n,double p,int q){super(n,p,q);}
    double calculateTotalPrice(){return price*qty;}
    public double applyDiscount(){return calculateTotalPrice()*0.1;}
    public String getDiscountDetails(){return "10% Veg Discount";}
}
class NonVegItem extends FoodItem{
    NonVegItem(String n,double p,int q){super(n,p,q);}
    double calculateTotalPrice(){return price*qty+50;}
}
public class FoodApp{
    public static void main(String[]args){
        FoodItem[]order={
            new VegItem("Paneer",200,2),
            new NonVegItem("Chicken",300,1)
        };
        for(FoodItem f:order){
            f.getItemDetails();
            System.out.println("Total:"+f.calculateTotalPrice());
        }
    }
}
