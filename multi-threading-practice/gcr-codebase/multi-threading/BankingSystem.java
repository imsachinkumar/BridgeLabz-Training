import java.time.LocalDateTime;
// BankAccount class
class BankAccount {
    private int balance = 10000;

    // synchronized withdrawal
    public synchronized void withdraw(String customer, int amount) {

        System.out.println("[" + customer + "] Attempting to withdraw " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now());
        } else {
            System.out.println("Transaction failed: " + customer +
                    ", Insufficient balance, Time: " + LocalDateTime.now());
        }
    }
}

// Transaction class
class Transaction implements Runnable {
    private BankAccount account;
    private String customerName;
    private int amount;

    Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(customerName, amount);
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) throws Exception {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

        // Display state before start
        System.out.println("State before start: " + t1.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("All transactions processed");
    }
}
