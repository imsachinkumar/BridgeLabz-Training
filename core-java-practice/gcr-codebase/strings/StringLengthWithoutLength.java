import java.util.Scanner;

public class StringLengthWithoutLength{
    static int findLength(String text){   //method to find length
        int count=0;
        try{
            while(true){              //checking if condition is right
                text.charAt(count);    
                count++;       //increase count
            }
        }catch(Exception e){}
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();

        System.out.println(findLength(text));
        System.out.println(text.length());
    }
}
