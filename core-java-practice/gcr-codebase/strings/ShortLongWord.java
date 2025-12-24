import java.util.*; 
public class ShortLongWord{
    static int length(String s){
        int i=0;
        try{while(true){s.charAt(i++);}}catch(Exception e){}   //manual length calculation
        return i;
    }
    static String[] split(String text){
        int len=length(text),words=1;   //get string length and word count
        for(int i=0;i<len;i++)if(text.charAt(i)==' ')words++;

        String[] arr=new String[words];
        int start=0,k=0;

        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){   //detect word boundary
                arr[k++]="";
                for(int j=start;j<i;j++)arr[k-1]+=text.charAt(j);
                start=i+1;
            }
        }
        return arr;   //return words array
    }
    static int[] shortestLongest(String[] words){
        int min=length(words[0]),max=min;   //initialize min and max
        for(String w:words){
            int l=length(w);   //calculate word length
            if(l<min)min=l;
            if(l>max)max=l;
        }
        return new int[]{min,max};   //return shortest and longest lengths
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();   //read input sentence

        int[] res=shortestLongest(split(text));   //get shortest and longest word lengths
        System.out.println("Shortest:"+res[0]);   
        System.out.println("Longest:"+res[1]);   
    }
}
