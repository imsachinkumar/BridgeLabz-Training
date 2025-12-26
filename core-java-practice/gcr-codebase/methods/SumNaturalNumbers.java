import java.util.*;
public class SumNaturalNumbers{
    static int sum(int n){   //Method to calculate sum
        int s=0;
        for(int i=1;i<=n;i++)s+=i;
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Sum is "+sum(n));
        sc.close();
    }
}
