package ecommerce;
interface Payment {
    abstract void paymentType(int amount) throws PaymentFailedException;
}