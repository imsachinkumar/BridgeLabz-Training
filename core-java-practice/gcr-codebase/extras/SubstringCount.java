import java.util.*;
public class SubstringCount{
    //Method to count substring occurrences
    static int countSub(String text,String sub){
        int count=0;
        for(int i=0;i<=text.length()-sub.length();i++){
            if(text.substring(i,i+sub.length()).equals(sub))
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter main string: ");
        String text=sc.nextLine();
        System.out.print("Enter substring: ");
        String sub=sc.nextLine();
        System.out.println("Occurrences: "+countSub(text,sub));
        sc.close();
    }
}
