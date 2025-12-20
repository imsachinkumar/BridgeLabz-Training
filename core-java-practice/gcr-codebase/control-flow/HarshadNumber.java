import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//input
        int number=sc.nextInt();
        int sum=0,original=number;
        while(original!=0){sum+=original%10;original/=10;}//sum digits
        if(number%sum==0) System.out.println(number+" is a Harshad Number");
        else System.out.println(number+" is not a Harshad Number");
        sc.close();
    }
}
