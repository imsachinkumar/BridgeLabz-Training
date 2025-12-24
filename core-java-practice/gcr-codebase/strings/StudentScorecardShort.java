import java.util.*;
public class StudentScorecardShort {
    static int[][] generateScores(int n){
        int[][] s=new int[n][3];   //scores for n students, 3 subjects
        Random r=new Random();
        for(int i=0;i<n;i++)for(int j=0;j<3;j++)s[i][j]=r.nextInt(51)+50;   //random scores 50-100
        return s;
    }
    static double[][] calculateStats(int[][] s){
        double[][] st=new double[s.length][3];   //total, average, percentage
        for(int i=0;i<s.length;i++){
            int total=s[i][0]+s[i][1]+s[i][2];   //sum of 3 subjects
            st[i][0]=Math.round(total*100.0)/100.0;   //total
            st[i][1]=Math.round(total/3.0*100.0)/100.0;   //average
            st[i][2]=Math.round(total/300.0*100.0*100.0)/100.0;   //percentage
        }
        return st;
    }

    static String[] grades(double[][] st){
        String[] g=new String[st.length];   //grades array
        for(int i=0;i<st.length;i++){
            double p=st[i][2];   //percentage
            g[i]=p>=80?"A":p>=70?"B":p>=60?"C":p>=50?"D":p>=40?"E":"R";   //assign grade
        }
        return g;
    }
    static void display(int[][] s,double[][] st,String[] g){
        System.out.println("S.No\tP\tC\tM\tTotal\tAvg\t% \tGrade");   //header
        for(int i=0;i<s.length;i++)
            System.out.println((i+1)+"\t"+s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+st[i][0]+"\t"+st[i][1]+"\t"+st[i][2]+"\t"+g[i]);   //print each student
    }
    public static void main(String[] args){
        int n=10;   //number of students
        int[][] scores=generateScores(n);   //generate random scores
        double[][] stats=calculateStats(scores);   //calculate total, avg, %
        String[] g=grades(stats);   //determine grades
        display(scores,stats,g); 
    }
}
