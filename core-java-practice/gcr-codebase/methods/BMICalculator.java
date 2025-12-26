import java.util.*;
public class BMICalculator{

    //Method to calculate BMI and store in 3rd column
    static void calculateBMI(double[][] data){
        for(int i=0;i<data.length;i++){
            double weight=data[i][0];
            double heightCm=data[i][1];
            double heightMeter=heightCm/100;
            data[i][2]=weight/(heightMeter*heightMeter);
        }
    }
    
    //Method to determine BMI status
    static String[] getBMIStatus(double[][] data){
        String[] status=new String[data.length];
        for(int i=0;i<data.length;i++){
            double bmi=data[i][2];
            if(bmi<=18.4){
                status[i]="Underweight";
            }else if(bmi>=18.5 && bmi<=24.9){
                status[i]="Normal";
            }else if(bmi>=25.0 && bmi<=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];

        //Input weight and height
        for(int i=0;i<10;i++){
            System.out.print("Enter weight of person "+(i+1)+" in kg: ");
            data[i][0]=sc.nextDouble();
            System.out.print("Enter height of person "+(i+1)+" in cm: ");
            data[i][1]=sc.nextDouble();
        }
        calculateBMI(data);
        String[] status=getBMIStatus(data);
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for(int i=0;i<10;i++){
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
            data[i][0],data[i][1],data[i][2],status[i]);
        }
        sc.close();
    }
}
