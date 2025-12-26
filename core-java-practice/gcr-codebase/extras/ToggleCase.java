import java.util.*;
public class ToggleCase{
    //Method to toggle case
    static String toggle(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a'&&ch<='z')
                result+=(char)(ch-32);
            else if(ch>='A'&&ch<='Z')
                result+=(char)(ch+32);
            else
                result+=ch;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        System.out.println("Toggled: "+toggle(input));
        sc.close();
    }
}
