import java.util.Scanner;

public class IllegalArgumentExceptionDemo{
    static void generateException(String text){
        //substring with start index greater than end index
        System.out.println(text.substring(5,2));   //this will throw IllegalArgumentException

    }
    static void handleException(String text){     //Method to handle exception using try-catch
        try{
            System.out.println(text.substring(5,2));
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");              //handles IllegalArgumentException

        }catch(RuntimeException e){

            //handles any other runtime exception
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//scanner for user input
        String text=sc.next();//read input string
        try{
            generateException(text);              //calling method that generates exception

        }catch(Exception e){
            System.out.println("Exception caught in main");
        }

        //calling method that handles exception internally
        handleException(text);
    }
}
