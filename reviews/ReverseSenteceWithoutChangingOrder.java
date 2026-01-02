package reviews;
import java.util.*;
public class ReverseSenteceWithoutChangingOrder{
    public static void main(String[] args) {
        String str=" India is   my  country ";
        str=str.trim(); // usecase -> 1
        String[] s1=str.split("\\s+");   //usecase ->2 
        StringBuilder reversedSentence = new StringBuilder();
        for(String word : s1){
            String reversedWord = new StringBuilder(word).reverse().toString();//usecase -> 3
            reversedSentence.append(reversedWord).append(" ");
        }
     System.out.println(reversedSentence.toString().trim()); //usecase -> 4 ,5
   }
}
