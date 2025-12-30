public class BankAccount{
    String accountHolder;
    String accountNumber;
    double balance;
    //Method to display Balance
    void displayBalance(){
        System.out.println("Current balance: "+balance);
    }
   // Method to show deposits
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
        displayBalance();
    }
   //Method fro withdraw amount
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdraw amount is : "+amount);
            displayBalance();
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args){
        //Creating Objects
        BankAccount acc=new BankAccount();
        acc.accountHolder="State of Chennai";
        acc.balance=700;
        acc.displayBalance();
        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(1000);
    }
}
