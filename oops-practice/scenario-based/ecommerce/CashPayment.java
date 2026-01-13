package ecommerce;

public class CashPayment implements Payment{
    public void paymentType(int amount){
        System.out.println("Cash Payment to be done of amount"+amount);
    }
}