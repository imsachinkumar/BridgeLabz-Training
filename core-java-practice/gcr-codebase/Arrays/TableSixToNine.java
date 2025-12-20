import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: "); //taking input
        int number=sc.nextInt();
        int[] result=new int[4];
        for(int i=6;i<=9;i++){   //loop from 6 to 9 according to question
            result[i-6]=number*i; //multiply number to 6 to 9
        }
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+result[i-6]);
        }
        sc.close();
    }
}
