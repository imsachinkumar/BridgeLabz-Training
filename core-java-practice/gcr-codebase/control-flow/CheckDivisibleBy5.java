import java.util.Scanner;
public class CheckDivisibleBy5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//input
        int number=sc.nextInt();//read number
        boolean isDivisible=number%5==0;//check divisibility
        System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);//print
        sc.close();
    }
}
