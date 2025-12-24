import java.util.*;
public class VowelConsonantCount{
    static int type(char ch){
        if(ch>='A'&&ch<='Z')ch=(char)(ch+32);   //convert uppercase to lowercase
        if(ch>='a'&&ch<='z'){   //check alphabet
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return 1;   //vowel
            return 2;   //consonant
        }
        return 0;
    }
    static int[] count(String text){
        int v=0,c=0;   //vowel and consonant counters
        for(int i=0;i<text.length();i++){
            int t=type(text.charAt(i));   //check character type
            if(t==1)v++;
            if(t==2)c++;
        }
        return new int[]{v,c}; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        int[] r=count(text);   //get vowel and consonant count
        System.out.println("Vowels:"+r[0]);
        System.out.println("Consonants:"+r[1]);
    }
}
