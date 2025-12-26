import java.util.*;
public class VowelConsonantCounter{
    //Method to count vowels and consonants in a string
    static void countVowelsAndConsonants(String text){
        int vowels=0,consonants=0; 
        //Convert to lowercase to handle both upper and lower case letters
        text=text.toLowerCase();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a'&&ch<='z'){
                //Check for vowel characters
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++; //if not vowel, it's a consonant
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        countVowelsAndConsonants(input);
        sc.close();
    }
}
