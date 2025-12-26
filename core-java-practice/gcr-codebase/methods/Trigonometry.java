import java.util.*;
public class Trigonometry{
    public static double[] calculateTrigonometricFunctions(double angle){//Method to calculate Trignometric function
        double rad=Math.toRadians(angle);
        return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter angle in degrees: "); //Input angle in degree
        double angle=sc.nextDouble();
        double[] r=calculateTrigonometricFunctions(angle); //calling method
        System.out.println("Sin: "+r[0]);
        System.out.println("Cos: "+r[1]);
        System.out.println("Tan: "+r[2]);
        sc.close();
    }
}
