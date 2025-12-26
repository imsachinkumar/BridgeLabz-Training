import java.util.*;
public class PalindromeCheck{
    //Method to check palindrome
    static boolean isPalindrome(String text){
        int i=0,j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        if(isPalindrome(input))
            System.out.println("Palindrome string");
        else
            System.out.println("Not a palindrome string");
        sc.close();
    }
}
