class BankAccount {
    int accountNumber;
    double balance;
    // Constructor to initialize common data
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate; // unique attribute
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Account Type : Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit; // unique attribute
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Account Type     : Checking Account");
        System.out.println("Withdrawal Limit : " + withdrawalLimit);
    }
}
// subclass
class FixedDepositAccount extends BankAccount {
    int lockPeriod; // in months
    FixedDepositAccount(int accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }
    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Lock Period  : " + lockPeriod + " months");
    }
}
public class BankSystem {
    public static void main(String[] args) {
        //Creating Object
        SavingsAccount sa = new SavingsAccount(1001, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(1002, 30000, 20000);
        FixedDepositAccount fd = new FixedDepositAccount(1003, 100000, 24);
        System.out.println("Account No: " + sa.accountNumber + ", Balance: " + sa.balance);
        sa.displayAccountType();
        System.out.println("Account No: " + ca.accountNumber + ", Balance: " + ca.balance);
        ca.displayAccountType();
        System.out.println("Account No: " + fd.accountNumber + ", Balance: " + fd.balance);
        fd.displayAccountType();
    }
}
