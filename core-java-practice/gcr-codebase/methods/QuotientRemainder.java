import java.util.*;
public class QuotientRemainder{
    public static int[] findRemainderAndQuotient(int number,int divisor){//Method to calculate Remainder and Quotient
        return new int[]{number/divisor,number%divisor};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.print("Enter divisor: ");
        int d=sc.nextInt();
        int[] r=findRemainderAndQuotient(n,d); //Method calling
        System.out.println("Quotient: "+r[0]);
        System.out.println("Remainder: "+r[1]);
        sc.close();
    }
}
