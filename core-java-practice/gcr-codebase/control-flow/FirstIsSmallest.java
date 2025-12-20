import java.util.Scanner;
public class FirstIsSmallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//input
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        boolean result=number1<number2 && number1<number3;//check smallest
        System.out.println("Is the first number the smallest? "+result);//print
        sc.close();
    }
}
