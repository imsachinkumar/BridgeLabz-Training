import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        
        while(temp!=0){ // Count digits
            count++;
            temp/=10;
        }
        int[] digits=new int[count];
        int[] reverse=new int[count];
        for(int i=0;i<count;i++){          // Store digits
            digits[i]=number%10;
            number/=10;
        }
        // Reverse array
        for(int i=0;i<count;i++){
            reverse[i]=digits[count-1-i];
        }
        System.out.print("Reversed Number: ");
        for(int i=0;i<count;i++){
            System.out.print(reverse[i]);
        }
        sc.close();
    }
}
