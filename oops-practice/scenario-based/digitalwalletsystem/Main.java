package digitalwalletsystem;
public class Main {
    public static void main(String[] args) {
        try {
            // Create users
            User u1 = new User(1, "Sachin");
            User u2 = new User(2, "Rahul");

            // Create wallets
            Wallet w1 = new Wallet(u1);
            Wallet w2 = new Wallet(u2);
            // Add money
            w1.addMoney(5000);
            // Choose transfer strategy (Polymorphism)
            TransferService transferService = new WalletToWalletTransfer();

            // Transfer money
            transferService.transfer(w1, w2, 2000);
            System.out.println(u1.getName() + " Balance: " + w1.getBalance());
            System.out.println(u2.getName() + " Balance: " + w2.getBalance());
            // View transactions
            w1.showTransactions();
            w2.showTransactions();

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
