package digitalwalletsystem;
// Interface for transfer service
public interface TransferService {
    void transfer(Wallet from, Wallet to, double amount)
        throws InsufficientBalanceException;
}
