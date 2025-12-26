import java.util.*;
public class FactorOperations {
    static int[] findFactors(int num) {     // Method to find all factors of a given number
        int count = 0;
        for (int i = 1; i <= num; i++) {         // Loop for count how many factors the number has
            if (num % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {  // loop to  store the factors in the array
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }
    // Method to calculate sum of all factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }
    static long productOfFactors(int[] factors) {      // Method to calculate product of all factors
        long product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    // Method to calculate sum of squares of factors
    static long sumOfSquares(int[] factors) {
        long sum = 0;
        for (int f : factors)
            sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors are: ");
        for (int f : factors)
            System.out.print(f + " ");
        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        sc.close();
    }
}
