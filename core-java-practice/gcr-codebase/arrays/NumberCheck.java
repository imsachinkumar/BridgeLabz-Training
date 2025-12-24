import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Declare an array of 5 integers
        int[] numbers=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<numbers.length;i++){
            System.out.print("Number "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        System.out.println("\nNumber Analysis:");

        for(int i=0;i<numbers.length;i++){// Loop through the array to check each number
            if(numbers[i]>0){             // Check if number is positive
                // Check even or odd
                if(numbers[i]%2==0){
                    System.out.println(numbers[i]+" is positive and even");
                }else{
                    System.out.println(numbers[i]+" is positive and odd");
                }
            }
            else if(numbers[i]<0){
                System.out.println(numbers[i]+" is negative");
            }else{
                System.out.println(numbers[i]+" is zero");
            }
        }
        System.out.println("\nComparing first and last elements:");
        // Compare first and last elements of the array
        if(numbers[0]==numbers[numbers.length-1]){
            System.out.println("First and last elements are equal");
        }
        else if(numbers[0]>numbers[numbers.length-1]){
            System.out.println("First element is greater than last element");
        }
        else{
            System.out.println("First element is less than last element");
        }
        sc.close();
    }
}
