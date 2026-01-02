import java.util.*;
public class StudentScoreManager{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        // Array to store scores
        double[] scores=new double[n];
        for(int i=0;i<n;i++){
            while(true){
                System.out.print("Enter score for student "+(i+1)+": ");
                // Check if input is a number
                if(sc.hasNextDouble()){
                    double value=sc.nextDouble();
                    if(value>=0){
                        scores[i]=value;
                        break;
                    }else{
                        System.out.println("Score cannot be negative.");
                    }
                }else{
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
            }
        }
        double sum=0;
        double highest=scores[0];
        double lowest=scores[0];
        for(int i=0;i<n;i++){
            sum+=scores[i];
            if(scores[i]>highest){
                highest=scores[i];
            }
            if(scores[i]<lowest){
                lowest=scores[i];
            }
        }
        // Calculate average
        double average=sum/n;
        System.out.println("\nAverage Score: "+average);
        System.out.println("Highest Score: "+highest);
        System.out.println("Lowest Score: "+lowest);
        System.out.println("Scores above average:");
        for(int i=0;i<n;i++){
            if(scores[i]>average){
                System.out.println(scores[i]);
            }
        }
        sc.close();
    }
}
