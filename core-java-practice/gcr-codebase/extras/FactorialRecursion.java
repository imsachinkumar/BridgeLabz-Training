import java.util.*;
public class FactorialRecursion{
    static int takeInput(Scanner sc){
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    //Method to calculate factorial using recursion
    static long factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }
    static void show(long res){
        System.out.println("Factorial: "+res);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=takeInput(sc);
        long ans=factorial(n);
        show(ans);
        sc.close();
    }
}
