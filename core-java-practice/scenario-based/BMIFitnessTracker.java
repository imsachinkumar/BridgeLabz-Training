import java.util.*;
public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");  //Input
        double weightInKg = sc.nextDouble();
        System.out.print("Enter height (in meters): ");   //Input
        double heightInMeters = sc.nextDouble();

        double bmi = weightInKg / (heightInMeters * heightInMeters); //calculation using Formula
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {                  // Determine BMI category using if-else
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
        sc.close();
    }
}
