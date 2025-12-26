import java.util.*;
public class StudentScorecard{
    // generate random PCM marks for students
    static int[][] generatePCM(int n){
        int[][] pcm=new int[n][3]; // [P,C,M]
        for(int i=0;i<n;i++){
            pcm[i][0]=10+(int)(Math.random()*90);
            pcm[i][1]=10+(int)(Math.random()*90);
            pcm[i][2]=10+(int)(Math.random()*90);
        }
        return pcm;
    }
    // calculate total, average and percentage
    static double[][] calculateResults(int[][] pcm){
        int n=pcm.length;
        double[][] res=new double[n][3];
        for(int i=0;i<n;i++){
            int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            // round to 2 digits
            avg=Math.round(avg*100.0)/100.0;
            percent=Math.round(percent*100.0)/100.0;
            res[i][0]=total;
            res[i][1]=avg;
            res[i][2]=percent;
        }
        return res;
    }

    static void display(int[][] pcm,double[][] res){
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");
        for(int i=0;i<pcm.length;i++){
            System.out.println((i+1)+"\t"+pcm[i][0]+"\t"+pcm[i][1]+"\t"+pcm[i][2]
                    +"\t"+res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] pcm=generatePCM(n);
        double[][] res=calculateResults(pcm);
        display(pcm,res);
        sc.close();
    }
}
