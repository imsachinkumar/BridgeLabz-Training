import java.util.*; 
public class VotingCheck{
    static int[] ages(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=(int)(Math.random()*90);   //generate random ages 0-89
        return a;
    }
    static String[][] result(int[] a){
        String[][] r=new String[a.length][2];   //2D array: age and voting eligibility
        for(int i=0;i<a.length;i++){
            r[i][0]=String.valueOf(a[i]);   //store age
            r[i][1]=(a[i]>=18&&a[i]>=0)?"true":"false";   //check if eligible to vote
        }
        return r;
    }
    static void display(String[][] r){
        for(String[] row:r)
            System.out.println(row[0]+"\t"+row[1]);   //display age and eligibility
    }
    public static void main(String[] args){
        display(result(ages(10)));   //generate ages, check eligibility, and display
    }
}
