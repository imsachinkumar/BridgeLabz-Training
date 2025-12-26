import java.util.*;
public class RemoveDuplicates{
    //Method to remove duplicate characters
    static String removeDup(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(result.indexOf(ch)==-1)
                result+=ch;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        System.out.println("After removing duplicates: "+removeDup(input));
        sc.close();
    }
}
