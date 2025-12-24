import java.util.*;
public class FrequencyNestedLoop{
    static String[] frequencyNested(String str){   //calculate frequency using nested loops
        char[] chars=str.toCharArray();
        int n=chars.length;
        String[] freqArr=new String[n];
        for(int i=0;i<n;i++){
            if(chars[i]=='0')continue;   //skip already counted characters
            int count=1;
            for(int j=i+1;j<n;j++){
                if(chars[i]==chars[j]){count++;chars[j]='0';}   //mark duplicates
            }
            freqArr[i]=chars[i]+" : "+count;   //store frequency string
        }
        return freqArr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");   //prompt for input
        String text=sc.nextLine();
        String[] freq=frequencyNested(text);   //calculate frequencies
        System.out.println("Character frequencies (nested loops):");
        for(String f:freq)if(f!=null)System.out.println(f);   //display results
        sc.close();
    }
}
