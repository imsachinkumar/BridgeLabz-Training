import java.util.Scanner;
public class FrequencyUsingUnique{
    static char[] uniqueCharacters(String str){   //get unique characters in string
        char[] temp=new char[str.length()];
        int index=0;
        for(int i=0;i<str.length();i++){
            boolean unique=true;
            for(int j=0;j<i;j++)if(str.charAt(j)==str.charAt(i)){unique=false;break;}
            if(unique)temp[index++]=str.charAt(i);
        }
        char[] result=new char[index];
        for(int i=0;i<index;i++)result[i]=temp[i];
        return result;
    }

    static String[][] frequencyUsingUnique(String str){   //count frequency of each unique character
        char[] uniques=uniqueCharacters(str);
        String[][] freq=new String[uniques.length][2];
        for(int i=0;i<uniques.length;i++){
            int count=0;
            for(int j=0;j<str.length();j++)if(str.charAt(j)==uniques[i])count++;
            freq[i][0]=Character.toString(uniques[i]);
            freq[i][1]=Integer.toString(count);
        }
        return freq;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String text=sc.nextLine();
        String[][] freq=frequencyUsingUnique(text);   //calculate frequencies
        System.out.println("Frequencies using unique characters:");
        for(String[] f:freq)System.out.println(f[0]+":"+f[1]);   //display results
        sc.close();
    }
}
