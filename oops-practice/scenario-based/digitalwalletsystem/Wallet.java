package digitalwalletsystem;

// Wallet entity class
public class Wallet {
    private User user;
    private double balance;
    private Transaction[] transactions;
    private int count;

    public Wallet(User user) {
        this.user = user;
        this.balance = 0;
        this.transactions = new Transaction[10];
        this.count = 0;
    }
    // Add money to wallet
    public void addMoney(double amount) {
        balance += amount;
        transactions[count++] = new Transaction("Credit", amount);
    }

    // Withdraw money from wallet
    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        transactions[count++] = new Transaction("Debit", amount);
    }

    public double getBalance() {
        return balance;
    }

    public User getUser() {
        return user;
    }

    // View transaction history
    public void showTransactions() {
        System.out.println("Transaction History:");
        for (int i = 0; i < count; i++) {
            transactions[i].display();
        }
    }
}
