import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;                        // Make a copy of number to count digits
        int count = 0;

        // Count digits
        while(temp != 0){
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];           // Array to store digits
        temp = number;
        for(int i = 0; i < count; i++){
            digits[i] = temp % 10;
            temp /= 10;
        }
        // Frequency array (0-9)
        int[] frequency = new int[10];
        for(int i = 0; i < count; i++){            // Calculate frequency
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequencies:");
        for(int i = 0; i < 10; i++){
            if(frequency[i] > 0){
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}
