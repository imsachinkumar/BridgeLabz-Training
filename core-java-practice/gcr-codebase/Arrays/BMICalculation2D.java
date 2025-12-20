import java.util.Scanner;

public class BMICalculation2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number=sc.nextInt();
        double[][] personData=new double[number][3];           // 2D array to store weight, height and BMI

        String[] weightStatus=new String[number];              // Array to store weight status
        // Take input for weight and height
        for(int i=0;i<number;i++){
            System.out.println("\nEnter details for Person "+(i+1));
            while(true){
                System.out.print("Enter weight (kg): ");
                double weight=sc.nextDouble();
                if(weight>0){
                    personData[i][0]=weight;
                    break;
                }else{
                    System.out.println("Invalid weight! Enter positive value.");
                }
            }
            // Input height with validation
            while(true){
                System.out.print("Enter height (meters): ");
                double height=sc.nextDouble();
                if(height>0){
                    personData[i][1]=height;
                    break;
                }else{
                    System.out.println("Invalid height! Enter positive value.");
                }
            }
        }
        for(int i=0;i<number;i++){              // Calculate BMI and weight
            double weight=personData[i][0];
            double height=personData[i][1];
            double bmi=weight/(height*height);
            personData[i][2]=bmi;
            // Determine weight status
            if(bmi<18.5){
                weightStatus[i]="Underweight";
            }
            else if(bmi<25){
                weightStatus[i]="Normal";
            }
            else if(bmi<30){
                weightStatus[i]="Overweight";
            }
            else{
                weightStatus[i]="Obese";
            }
        }
        System.out.println("\n----- BMI REPORT -----");
        for(int i=0;i<number;i++){
            System.out.println("Person "+(i+1));
            System.out.println("Weight: "+personData[i][0]+" kg");
            System.out.println("Height: "+personData[i][1]+" m");
            System.out.println("BMI: "+personData[i][2]);
            System.out.println("Status: "+weightStatus[i]);
            System.out.println();
        }
        sc.close();
    }
}
