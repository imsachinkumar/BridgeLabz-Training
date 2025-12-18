import java.util.*;
public class ReverseString {
    public static void reverse(char[] s) {//method to reverse string

        int lt = 0;                  // starting index
        int rt = s.length - 1;      // last index

        //Swapping 

        while (lt < rt) {
            char temp = s[lt];       
            s[lt] = s[rt];          
            s[rt] = temp;           
            lt++;                    
            rt--;                  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Input
        String str = sc.nextLine();

        // Convert string to character array
        char[] s = str.toCharArray();

        // Calling reverse method
        reverse(s);

        // Print reversed string
        System.out.println(new String(s));

    }
}
