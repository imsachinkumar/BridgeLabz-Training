import java.util.*;
public class BasicCalculator{
    // Returns sum of two numbers
    static double add(double a,double b){
        return a+b;
    }
    // Returns difference of two numbers
    static double sub(double a,double b){
        return a-b;
    }
    // Returns product of two numbers

    static double mul(double a,double b){
        return a*b;
    }
    // Returns division of two numbers

    static double div(double a,double b){
        return a/b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        System.out.print("Choose: ");
        int ch=sc.nextInt();
        System.out.print("Enter two numbers: ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(ch==1) System.out.println("Result: "+add(x,y));
        else if(ch==2) System.out.println("Result: "+sub(x,y));
        else if(ch==3) System.out.println("Result: "+mul(x,y));
        else if(ch==4) System.out.println("Result: "+div(x,y));
        else System.out.println("Invalid choice");
        sc.close();
    }
}
