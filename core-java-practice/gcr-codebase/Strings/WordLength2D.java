import java.util.Scanner;   //for input
public class WordLength2D{
    static int length(String s){
        int i=0;
        try{while(true){s.charAt(i++);}}catch(Exception e){}   //find length manually
        return i;
    }
    static String[] split(String text){
        int len=length(text),words=1;   //get length and count words
        for(int i=0;i<len;i++)if(text.charAt(i)==' ')words++;

        String[] arr=new String[words];
        int start=0,k=0;

        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){   //word boundary
                arr[k++]="";
                for(int j=start;j<i;j++)arr[k-1]+=text.charAt(j);
                start=i+1;
            }
        }
        return arr;   //return words array
    }

    static String[][] build2D(String[] words){
        String[][] data=new String[words.length][2];   //2D array: word and length
        for(int i=0;i<words.length;i++){
            data[i][0]=words[i];   //store word
            data[i][1]=String.valueOf(length(words[i]));   //store word length
        }
        return data;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();   //read input sentence

        String[][] data=build2D(split(text));   //build 2D array

        for(int i=0;i<data.length;i++)
            System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));   //print word and length
    }
}
