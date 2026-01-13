package ecommerce;
public class PaymentFailedException extends Exception{
  PaymentFailedException(String msg){
    super(msg);
  }
}