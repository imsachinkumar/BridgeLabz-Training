import java.util.ArrayList;
import java.util.List;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
//Abstraction
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();
}
//Base Class
abstract class Account implements BankService {
    protected int accountNumber;
    protected String holderName;
    protected double balance;
    protected List<String> transactionHistory;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
    }
    // Synchronized withdraw (Multithreading safe)
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: ₹" + amount);
    }
    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}
//Inheritance +polymorphism
class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    // Polymorphism: different interest logic
    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
//Multithreading
class FundTransfer extends Thread {
    private Account fromAccount;
    private Account toAccount;
    private double amount;

    public FundTransfer(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (fromAccount) {
            try {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transferred ₹" + amount +
                        " from Account " + fromAccount.accountNumber +
                        " to Account " + toAccount.accountNumber);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class OnlineBankingSystem {

    public static void main(String[] args) {
     //CREATE
        Account savings = new SavingsAccount(101, "Sachin", 5000);
        Account current = new CurrentAccount(102, "Rahul", 3000);
        //READ
        System.out.println("Savings Balance: ₹" + savings.getBalance());
        System.out.println("Current Balance: ₹" + current.getBalance());
        /* -------- MULTITHREADED FUND TRANSFER -------- */
        FundTransfer t1 = new FundTransfer(savings, current, 1000);
        FundTransfer t2 = new FundTransfer(savings, current, 2000);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //UPDATE
        System.out.println("Savings Balance After Transfer: ₹" + savings.getBalance());
        System.out.println("Current Balance After Transfer: ₹" + current.getBalance());
        System.out.println("Savings Interest: ₹" + savings.calculateInterest());
        System.out.println("Current Interest: ₹" + current.calculateInterest());
       //READ
        savings.showTransactions();
        current.showTransactions();
       //Delete
        savings.transactionHistory.clear();
        current.transactionHistory.clear();
        System.out.println("Transaction history cleared.");
    }
}
