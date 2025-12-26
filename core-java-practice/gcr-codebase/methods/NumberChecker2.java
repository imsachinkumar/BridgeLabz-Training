import java.util.*;
public class NumberChecker2{
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

    // Method to reverse the digits array

    static int[] reverseArray(int[] arr){
        int n=arr.length;
        int[] rev=new int[n];
        for(int i=0;i<n;i++) rev[i]=arr[n-1-i];
        return rev;
    }

    // Method to compare two arrays
    
    static boolean arraysEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }

    // Method to check if number is palindrome

    static boolean isPalindrome(int[] digits){
        int[] rev=reverseArray(digits);
        return arraysEqual(digits,rev);
    }

    // Method to check if number is a duck number
    static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0) return true;
        }
        return false;
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

        System.out.println("Reversed Digits: ");
        int[] rev=reverseArray(digits);
        for(int d:rev) System.out.print(d+" ");
        System.out.println();

        System.out.println("Is Palindrome: "+isPalindrome(digits));
        System.out.println("Is Duck Number: "+isDuckNumber(digits));
        sc.close();
    }
}
