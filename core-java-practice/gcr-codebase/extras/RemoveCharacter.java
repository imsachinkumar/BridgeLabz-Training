import java.util.*;
public class RemoveCharacter{
    //Method to remove a given character
    static String removeChar(String text,char rem){
        String result="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=rem)
                result+=text.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String text=sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch=sc.next().charAt(0);
        System.out.println("Modified String: "+removeChar(text,ch));
        sc.close();
    }
}
