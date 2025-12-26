import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    static int generateGuess(int low,int high){
        return new Random().nextInt(high-low+1)+low;
    }

    // Takes feedback from the user: high, low, or correct
    static String getFeedback(Scanner sc){
        System.out.print("Is it high,low,or correct? ");
        return sc.nextLine().toLowerCase();
    }

    // Updates the lower bound when the guess is too low
    static int nextLow(int guess){
        return guess+1;
    }

    // Updates the upper bound when the guess is too high
    static int nextHigh(int guess){
        return guess-1;
    }
    public static void main(String[] args){
        // Scanner to take user input
        Scanner sc=new Scanner(System.in);
        // Initial range for guessing
        int low=1,high=100;
        System.out.println("Think of a number between 1 and 100.");
        while(true){
            // Computer generates a guess
            int guess=generateGuess(low,high);
            System.out.println("Computer guess: "+guess);

            String fb=getFeedback(sc);
            if(fb.equals("correct")){
                System.out.println("Guessed correctly!");
                break;
            }else if(fb.equals("low")){
                low=nextLow(guess);
            }else if(fb.equals("high")){
                high=nextHigh(guess);
            }else{
                System.out.println("Enter high,low,or correct only.");
            }
        }
        sc.close();
    }
}
