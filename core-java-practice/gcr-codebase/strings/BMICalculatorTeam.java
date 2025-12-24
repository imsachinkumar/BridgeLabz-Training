import java.util.Scanner;

public class BMICalculatorTeam{
    static String[] calculateBMIStatus(double w,double h){
        double bmi=w/((h/100)*(h/100));   //calculate BMI using height in meters
        String status=(bmi<18.5)?"Underweight":(bmi<25)?"Normal":(bmi<30)?"Overweight":"Obese";   //determine BMI category
        return new String[]{String.format("%.2f",h),String.format("%.2f",w),String.format("%.2f",bmi),status};   //return formatted data
    }

    static void displayResults(String[][] r){
        System.out.printf("%-10s %-10s %-10s %-15s%n","Height(cm)","Weight(kg)","BMI","Status");   //header
        for(String[] row:r)System.out.printf("%-10s %-10s %-10s %-15s%n",row[0],row[1],row[2],row[3]);   //display each row
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;   //number of persons
        double[][] d=new double[n][2];   //store weight and height
        String[][] res=new String[n][4];   //store formatted BMI results

        for(int i=0;i<n;i++){
            System.out.print("Person "+(i+1)+" weight (kg): ");d[i][0]=sc.nextDouble();   //read weight
            System.out.print("Person "+(i+1)+" height (cm): ");d[i][1]=sc.nextDouble();   //read height
            res[i]=calculateBMIStatus(d[i][0],d[i][1]);   //calculate BMI and status
        }
        displayResults(res); 
        sc.close();   
    }
}
