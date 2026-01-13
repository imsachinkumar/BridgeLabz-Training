package digitalwalletsystem;
// Wallet to Wallet transfer implementation
public class WalletToWalletTransfer implements TransferService {
    @Override
    public void transfer(Wallet from, Wallet to, double amount)
        throws InsufficientBalanceException {
        from.withdrawMoney(amount);
        to.addMoney(amount);
    }
}
