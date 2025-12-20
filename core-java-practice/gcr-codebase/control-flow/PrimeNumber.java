import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//input
        int number=sc.nextInt();
        boolean isPrime=true;
        if(number<=1) isPrime=false;
        else{
            for(int i=2;i<=Math.sqrt(number);i++){//check divisibility
                if(number%i==0){isPrime=false;break;}
            }
        }
        System.out.println(number+" is prime? "+isPrime);
        sc.close();
    }
}
