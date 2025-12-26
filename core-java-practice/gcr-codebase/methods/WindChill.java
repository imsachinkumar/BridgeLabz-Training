import java.util.*;
public class WindChill{
    public static double calculateWindChill(double t,double v){//method to calculate windchill
        return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature: "); //Input for Temperature
        double t=sc.nextDouble();
        
        System.out.print("Enter wind speed: "); //Input for Wind
        double v=sc.nextDouble();
        System.out.println("Wind Chill: "+calculateWindChill(t,v));
        sc.close();
    }
}
