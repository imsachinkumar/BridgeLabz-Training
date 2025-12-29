import java.util.*;
public class FitnessChallengeTracker{
    // Method to calculate  total and average push-ups
    public static void calculateStats(int[] pushups){
        int total=0;
        int days=0;
        // for-each loop to process weekly data
        for(int p:pushups){

            // Skip rest day
            if(p==0){
                continue;
            }
            total+=p;
            days++;
        }
         double average;
         if(days>0){
             average=(double)total/days;
                  }else{
                   average=0;
                }
        System.out.println("Total push-ups:"+total);
        System.out.println("Average per active day:"+average);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] week=new int[7];
        System.out.println("Enter push-ups for 7 days (enter 0 for rest day):");
        // Store push-up counts for a week
        for(int i=0;i<7;i++){
            System.out.print("Day "+(i+1)+": ");
            week[i]=sc.nextInt();
        }
        calculateStats(week);
        sc.close();
    }
}
