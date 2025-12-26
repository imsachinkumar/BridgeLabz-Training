import java.util.*;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){  //Method to check student can vote
        if(age<0){
            return false;
        }
        if(age>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentVoteChecker svc=new StudentVoteChecker();
        int[] ages=new int[10];

        //Take input and check voting eligibility

        for(int i=0;i<ages.length;i++){
            System.out.print("Enter age of student "+(i+1)+": ");
            ages[i]=sc.nextInt();

            if(svc.canStudentVote(ages[i])){
                System.out.println("Student can vote");
            }else{
                System.out.println("Student cannot vote");
            }
        }
        sc.close();
    }
}
