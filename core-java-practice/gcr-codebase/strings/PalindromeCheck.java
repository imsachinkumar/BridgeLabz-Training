import java.util.*;
public class PalindromeCheck{
    static boolean isPalindromeIterative(String str){   //check palindrome using iteration
        int start=0,end=str.length()-1;
        while(start<end){if(str.charAt(start)!=str.charAt(end))return false;start++;end--;}
        return true;
    }
    static boolean isPalindromeRecursive(String str,int start,int end){   //check palindrome using recursion
        if(start>=end)return true;
        if(str.charAt(start)!=str.charAt(end))return false;
        return isPalindromeRecursive(str,start+1,end-1);
    }

    static boolean isPalindromeArray(String str){   //check palindrome by reversing array
        int n=str.length();
        char[] original=str.toCharArray();
        char[] rev=new char[n];
        for(int i=0;i<n;i++)rev[n-1-i]=str.charAt(i);   //reverse string into array
        for(int i=0;i<n;i++)if(original[i]!=rev[i])return false;   //compare original and reversed
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:"); 
        String text=sc.nextLine();
        System.out.println("Palindrome check (iterative):"+isPalindromeIterative(text));
        System.out.println("Palindrome check (recursive):"+isPalindromeRecursive(text,0,text.length()-1));
        System.out.println("Palindrome check (array method):"+isPalindromeArray(text));
        sc.close();
    }
}
