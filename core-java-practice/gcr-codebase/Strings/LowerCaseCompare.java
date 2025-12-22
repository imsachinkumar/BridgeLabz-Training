import java.util.Scanner; 
public class LowerCaseCompare{ 

    static String toLowerManual(String text){   
        String result="";  
        for(int i=0;i<text.length();i++){   //loop through each character
            char ch=text.charAt(i);   
            if(ch>='A'&&ch<='Z')   //check if character is uppercase
                ch=(char)(ch+32);   //convert uppercase to lowercase
            result+=ch;                             //append character to result
        }
        return result; 
    }

    static boolean compareStrings(String a,String b){ 
        if(a.length()!=b.length())return false;   //check length mismatch
        for(int i=0;i<a.length();i++){ 
            if(a.charAt(i)!=b.charAt(i))return false;   //compare characters
        }
        return true;   //return true if strings are equal
    }

    public static void main(String[] args){   
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine(); 

        String manual=toLowerManual(text);   //convert string manually
        String builtIn=text.toLowerCase();   //convert string using built-in method

        System.out.println(compareStrings(manual,builtIn));  
    }
}
