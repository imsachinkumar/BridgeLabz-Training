import java.util.*;
public class NumberCheck{
    static int checkNumber(int n){       // Method to check number type
        if(n>0)return 1;
        if(n<0)return -1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int result=checkNumber(n);
        System.out.println("Result: "+result);
        sc.close();
    }
}
