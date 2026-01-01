class BankAccount{
    // static variable shared by all BankAccount objects
    static String bankName="Secure Bank";
    static int totalAccounts=0;
    // final variable  cannot be changed 
    final int accountNumber;
    String accountHolderName;      // instance variable
    //constructor
    BankAccount(String accountHolderName,int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++; // increment total accounts
    }

    // static method 
    static void getTotalAccounts(){
        System.out.println("Total Accounts: "+totalAccounts);
    }
    // method to display account details 
    void displayDetails(Object obj){
        if(obj instanceof BankAccount){
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Holder: "+accountHolderName);
            System.out.println("Account Number: "+accountNumber);
        }else{
            System.out.println("Not a BankAccount object");
        }
    }
}
public class BankAccountSystem{
    public static void main(String[] args){
        // creating objects
        BankAccount acc1=new BankAccount("Sachin",101);
        BankAccount acc2=new BankAccount("Amit",102);
        // displaying details
        acc1.displayDetails(acc1);
        System.out.println("------------------");
        acc2.displayDetails(acc2);
        BankAccount.getTotalAccounts();
    }
}
