import java.util.Scanner;   //Scanner for input

public class SplitCompare{
    static int length(String s){
        int i=0;
        try{while(true){s.charAt(i++);}}catch(Exception e){}   //find length using exception
        return i;
    }

    static String[] manualSplit(String text){
        int len=length(text),words=1;   //length and word count
        for(int i=0;i<len;i++)if(text.charAt(i)==' ')words++;          //if condition match increase count

        String[] arr=new String[words];
        int start=0,index=0;

        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){
                arr[index++]="";
                for(int j=start;j<i;j++)arr[index-1]+=text.charAt(j);
                start=i+1;
            }
        }
        return arr;   
    }
    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length)return false;   //check length
        for(int i=0;i<a.length;i++)if(!a[i].equals(b[i]))return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine(); 

        String[] manual=manualSplit(text);
        String[] built=text.split(" ");
        System.out.println(compare(manual,built)); 
    }
}
