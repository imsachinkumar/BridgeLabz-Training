import java.util.Scanner;
public class ArrayIndexExceptionDemo{
    static void generateException(String[] names){
        System.out.println(names[names.length]);
    }
    static void handleException(String[] names){
        try{
            System.out.println(names[names.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names=new String[n];

        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }

        try{
            generateException(names);
        }catch(Exception e){
            System.out.println("Exception caught in main");
        }
        handleException(names);
    }
}
