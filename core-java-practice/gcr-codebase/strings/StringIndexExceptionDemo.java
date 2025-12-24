import java.util.*;
public class StringIndexExceptionDemo{
    static void generateException(String text){
        System.out.println(text.charAt(text.length()));
    }
    static void handleException(String text){
        try{
            System.out.println(text.charAt(text.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        try{
            generateException(text);
        }catch(Exception e){
            System.out.println("Exception caught in main");
        }
        handleException(text);
    }
}
