class BankAccount{
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    // Constructor
    BankAccount(String acc,String holder,double bal){
        accountNumber=acc;
        accountHolder=holder;
        balance=bal;
    }
    // Public method to get balance
    public double getBalance(){
        return balance;
    }
    // Public method to update balance
    public void setBalance(double b){
        balance=b;
    }
}
// Subclass to demonstrate protected access
class SavingsAccount extends BankAccount{
    SavingsAccount(String acc,String holder,double bal){
        super(acc,holder,bal);
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber); // public
        System.out.println("Account Holder: "+accountHolder); // protected
        System.out.println("Balance: "+getBalance());        // private via method
    }
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount("SB101","Anita",12000);
        s.displayDetails();
    }
}
