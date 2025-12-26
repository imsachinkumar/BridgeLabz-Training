import java.util.*;
public class ReverseString{
    //Method to reverse a string without built-in functions
    static String reverse(String text){
        String rev="";
        for(int i=text.length()-1;i>=0;i--){
            rev+=text.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        System.out.println("Reversed: "+reverse(input));
        sc.close();
    }
}
