import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] ht=new double[11];    //Initialise array for hieght
        double sum=0;
        for(int i=0;i<11;i++){
            System.out.print("Enter height of player "+(i+1)+": ");
            ht[i]=sc.nextDouble();
            sum+=ht[i]; //suming all elements of array
        }
        double mean=sum/11; // calculating mean
        System.out.println("Mean height of the football team = "+mean);
        sc.close();
    }
}
