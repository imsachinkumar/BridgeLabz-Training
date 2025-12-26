import java.util.*;
public class LineAndDistance{
    // method to find Euclidean distance
    static double findDistance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    // method to find slope and intercept
    static double[] findLine(double x1,double y1,double x2,double y2){
        double[] res=new double[2]; // [m,b]
        double m=(y2-y1)/(x2-x1);   // slope
        double b=y1-m*x1;          // intercept
        res[0]=m;
        res[1]=b;
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double dist=findDistance(x1,y1,x2,y2);
        double[] line=findLine(x1,y1,x2,y2);
        System.out.printf("\nDistance = %.2f\n",dist);
        System.out.printf("Equation of line: y = %.2f*x + %.2f\n",line[0],line[1]);
        sc.close();
    }
}
