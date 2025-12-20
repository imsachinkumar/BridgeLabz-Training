import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxSize = 10;           // Initial maximum size of the factors array
        int[] factors = new int[maxSize]; // Array to store factors
        int index = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0){               // Check if i is a factor of the number
                if(index == maxSize){          // If array is full, increase its siz
                    maxSize *= 2;               // Double the array size
                    int[] temp = new int[maxSize];
                    for(int j = 0; j < factors.length; j++){  // Copy old array elements to new array
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;      // Store the factor in array and increase index
            }
        }
        System.out.println("Factors:");
        for(int i = 0; i < index; i++){
            System.out.print(factors[i] + " ");
        }
        sc.close();
    }
}
