import java.util.*;
public class NumberChecker1{
    // Method to count digits in a number
    static int countDigits(int num){
        int count=0;
        int temp=num;
        while(temp!=0){
            count++;
            temp/=10;
        }
        return count;
    }
    // Method to store digits of a number in an array
    static int[] storeDigits(int num){
        int n=countDigits(num);
        int[] digits=new int[n];
        for(int i=n-1;i>=0;i--){
            digits[i]=num%10;
            num/=10;
        }
        return digits;
    }
    // Method to find sum of digits using digits array
    static int sumOfDigits(int[] digits){
        int sum=0;
        for(int d:digits) sum+=d;
        return sum;
    }
    // Method to find sum of squares of digits using digits array
    static int sumOfSquares(int[] digits){
        int sum=0;
        for(int d:digits) sum+=Math.pow(d,2);
        return sum;
    }
    // Method to check if number is Harshad number
    static boolean isHarshad(int num,int[] digits){
        int sum=sumOfDigits(digits);
        return num%sum==0;
    }
    // Method to find frequency of each digit using 2D array
    static int[][] digitFrequency(int[] digits){
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i; // first column-> digit
        for(int d:digits) freq[d][1]++;     // second column-> frequency
        return freq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int nDigits=countDigits(num);
        System.out.println("Number of digits: "+nDigits);

        int[] digits=storeDigits(num);
        System.out.print("Digits: ");
        for(int d:digits) System.out.print(d+" ");
        System.out.println();
        int sum=sumOfDigits(digits);
        System.out.println("Sum of digits: "+sum);
        int sumSq=sumOfSquares(digits);
        System.out.println("Sum of squares of digits: "+sumSq);
        System.out.println("Is Harshad Number: "+isHarshad(num,digits));

        int[][] freq=digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++){
            if(freq[i][1]>0)
                System.out.println("Digit "+freq[i][0]+": "+freq[i][1]+" time(s)");
        }
        sc.close();
    }
}
