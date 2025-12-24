import java.util.Scanner;
public class CharFrequency{
    static String[][] characterFrequency(String str){
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++)freq[str.charAt(i)]++;
        char[] uniques=new char[256];
        int index=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean isNew=true;
            for(int j=0;j<index;j++)if(uniques[j]==ch){isNew=false;break;}
            if(isNew)uniques[index++]=ch;
        }
        String[][] result=new String[index][2];
        for(int i=0;i<index;i++){
            result[i][0]=Character.toString(uniques[i]);
            result[i][1]=Integer.toString(freq[uniques[i]]);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String text=sc.nextLine();
        String[][] freq=characterFrequency(text);
        System.out.println("Character Frequencies:");
        for(String[] f:freq)System.out.println(f[0]+":"+f[1]);
        sc.close();
    }
}
