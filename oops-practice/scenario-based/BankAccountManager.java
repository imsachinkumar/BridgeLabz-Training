class BankAccount {
    // Fields / Properties
    private String accountNumber;
    private double balance;
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        // Check if deposit amount is valid
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        // Prevent overdraft by checking balance
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class BankAccountManager {
    public static void main(String[] args) {
        // Create  BankAccount object
        BankAccount account = new BankAccount("ACC12345", 5000);
        account.checkBalance();
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(6000);
        account.checkBalance();
    }
}
