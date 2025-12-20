import java.util.Scanner;
public class NumberSign{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//input
        int number=sc.nextInt();//read number
        if(number>0) System.out.println("Positive");
        else if(number<0) System.out.println("Negative");
        else System.out.println("Zero");
        sc.close();
    }
}
