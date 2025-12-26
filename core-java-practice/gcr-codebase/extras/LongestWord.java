import java.util.*;
public class LongestWord{
    //Method to find longest word
    static String findLongest(String sentence){
        String[] words=sentence.split(" ");
        String longest="";
        for(String w:words){
            if(w.length()>longest.length())
                longest=w;
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input=sc.nextLine();
        System.out.println("Longest word: "+findLongest(input));
        sc.close();
    }
}
