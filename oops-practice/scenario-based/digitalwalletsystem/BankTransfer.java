package digitalwalletsystem;

// Bank transfer implementation (with service charge)
public class BankTransfer implements TransferService {
    @Override
    public void transfer(Wallet from, Wallet to, double amount)
        throws InsufficientBalanceException {
        double serviceCharge = 10;
        from.withdrawMoney(amount + serviceCharge);
        to.addMoney(amount);
    }
}
