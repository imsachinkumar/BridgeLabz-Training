import java.util.Scanner;

public class NumberFormatExceptionDemo{
    static void generateException(String text){   //method to generate exception
        int num=Integer.parseInt(text);              //convert string to int (may throw exception)
        System.out.println(num);  
    }

    static void handleException(String text){   //method to handle exception
        try{   
            int num=Integer.parseInt(text);   //convert string to int
            System.out.println(num);   
        }catch(NumberFormatException e){   
            System.out.println("NumberFormatException handled");   
        }catch(RuntimeException e){                     //catch RuntimeException
            System.out.println("RuntimeException handled");   
        }
    }

    public static void main(String[] args){   
        Scanner sc=new Scanner(System.in);  
        String text=sc.next();  

        try{  
            generateException(text);   //call method that generates exception
        }catch(Exception e){   //catch exception in main
            System.out.println("Exception caught in main");   //print message
        }

        handleException(text);   //call method that handles exception
    }
}
