import java.util.*;
public class AnagramCheck{
    static boolean areAnagrams(String s1,String s2){   //check if two strings are anagrams
        if(s1.length()!=s2.length())return false;   
        int[] freq1=new int[256],freq2=new int[256];   //frequency arrays for ASCII chars
        for(int i=0;i<s1.length();i++){freq1[s1.charAt(i)]++;freq2[s2.charAt(i)]++;} 
        for(int i=0;i<256;i++)if(freq1[i]!=freq2[i])return false;   //compare frequencies
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string:");   //prompt first string
        String text1=sc.nextLine();
        System.out.print("Enter second string:");   //prompt second string
        String text2=sc.nextLine();
        System.out.println("Are the strings anagrams? "+areAnagrams(text1,text2)); 
        sc.close();
    }
}
