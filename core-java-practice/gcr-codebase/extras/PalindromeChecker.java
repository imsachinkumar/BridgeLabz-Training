import java.util.*;
public class PalindromeChecker{
    static String takeInput(Scanner sc){
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    //Method to check if a string is palindrome

    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
//Method to display result
    static void showResult(String s,boolean res){
        if(res) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=takeInput(sc);
        boolean result=isPalindrome(text);
        showResult(text,result);
        sc.close();
    }
}
