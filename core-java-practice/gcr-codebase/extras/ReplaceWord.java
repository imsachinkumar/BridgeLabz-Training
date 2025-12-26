import java.util.*;
public class ReplaceWord{
    //Method to replace a word in sentence
    static String replaceWord(String sentence,String oldWord,String newWord){
        String result="";
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord))
                result+=newWord;
            else
                result+=words[i];
            if(i<words.length-1)result+=" ";
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence=sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldW=sc.next();
        System.out.print("Enter new word: ");
        String newW=sc.next();
        System.out.println("Modified sentence: "+replaceWord(sentence,oldW,newW));
        sc.close();
    }
}
