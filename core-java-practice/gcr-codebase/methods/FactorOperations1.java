import java.util.*;
public class FactorOperations1{
    // Method to find factors of a number
    static int[] findFactors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) factors[index++]=i;
        }
        return factors;
    }
    // Method to find greatest factor
    static int greatestFactor(int[] factors){
        return factors[factors.length-1];
    }
    // Method to find sum of factors
    static int sumOfFactors(int[] factors){
        int sum=0;
        for(int f:factors) sum+=f;
        return sum;
    }
    // Method to find product of factors
    static long productOfFactors(int[] factors){
        long product=1;
        for(int f:factors) product*=f;
        return product;
    }
    // Method to find product of cubes of factors
    static long productOfCubes(int[] factors){
        long product=1;
        for(int f:factors) product*=(long)Math.pow(f,3);
        return product;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int[] factors=findFactors(num);
        System.out.print("Factors: ");
        for(int f:factors) System.out.print(f+" ");
        System.out.println();
        System.out.println("Greatest Factor: "+greatestFactor(factors));
        System.out.println("Sum of Factors: "+sumOfFactors(factors));
        System.out.println("Product of Factors: "+productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: "+productOfCubes(factors));
        sc.close();
    }
}
