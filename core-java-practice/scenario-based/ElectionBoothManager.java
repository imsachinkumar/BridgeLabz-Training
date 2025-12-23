import java.util.*;
public class ElectionBoothManager{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice1=0,choice2=0,choice3=0;  // Variables to count votes for each candidate
        while(true){ // Loop to handle multiple voters
            System.out.print("Enter age (or -1 to exit): ");
            int age=sc.nextInt();
            if(age==-1){
                break;
            }
            // Check if voter is eligible
            if(age>=18){
                System.out.print("Vote (1, 2, or 3): ");
                int vote=sc.nextInt();

                // Record vote based on choice
                if(vote==1) choice1++;
                else if(vote==2) choice2++;
                else if(vote==3) choice3++;
                else System.out.println("Invalid vote");
            }else{
                System.out.println("Not eligible to vote");
            }
        }
        System.out.println("\nElection Results:");
        System.out.println("Candidate 1: "+choice1);
        System.out.println("Candidate 2: "+choice2);
        System.out.println("Candidate 3: "+choice3);
        sc.close();
    }
}
