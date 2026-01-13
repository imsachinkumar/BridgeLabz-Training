package digitalwalletsystem;
// Custom exception thrown when balance is not sufficient
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
