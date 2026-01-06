// Loan interface
interface Loanable{
    void applyForLoan();
    boolean isEligible();
}
// Abstract class
abstract class BankAccount{
    private String accNo,name;
    private double balance;
     //Constructor
    BankAccount(String accNo,String name,double bal){
        this.accNo=accNo;
        this.name=name;
        balance=bal;
    }
    public String getName(){return name;}
    public double getBalance(){return balance;}
    public void deposit(double amt){
        if(amt>0)balance+=amt;
    }
    public void withdraw(double amt){
        if(amt<=balance)balance-=amt;
    }

    abstract double calculateInterest();
}
// Savings account
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(String a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return getBalance()*0.05;
    }
    public void applyForLoan(){
        System.out.println("Savings loan applied");
    }
    public boolean isEligible(){
        return getBalance()>=5000;
    }
}
// Current account
class CurrentAccount extends BankAccount implements Loanable{
    CurrentAccount(String a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return getBalance()*0.02;
    }
    public void applyForLoan(){
        System.out.println("Current loan applied");
    }
    public boolean isEligible(){
        return getBalance()>=10000;
    }
}
public class BankingApp{
    public static void main(String[]args){
        BankAccount[]accounts={
            new SavingsAccount("SA1","Amit",8000),
            new CurrentAccount("CA1","Riya",15000)
        };
        for(BankAccount acc:accounts){
            System.out.println("\nHolder: "+acc.getName());
            System.out.println("Balance: "+acc.getBalance());
            System.out.println("Interest: "+acc.calculateInterest());
            Loanable loan=(Loanable)acc;
            loan.applyForLoan();
            System.out.println("Loan Eligible: "+loan.isEligible());
        }
    }
}
