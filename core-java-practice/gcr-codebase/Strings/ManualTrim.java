import java.util.Scanner;   

public class ManualTrim{
    static int[] trimIndex(String s){
        int start=0,end=s.length()-1;
        while(s.charAt(start)==' ')start++;   //find first non-space index
        while(s.charAt(end)==' ')end--;       //find last non-space index
        return new int[]{start,end};
    }

    static String substring(String s,int st,int en){
        String r="";
        for(int i=st;i<=en;i++)r+=s.charAt(i);   //build substring manually
        return r;
    }

    static boolean compare(String a,String b){
        if(a.length()!=b.length())return false;   //check length mismatch
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))return false;   //compare characters
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();  

        int[] idx=trimIndex(text);   //get start and end indices after trimming
        String manual=substring(text,idx[0],idx[1]);   //manual trimmed string
        String built=text.trim();   //built-in trim

        System.out.println(compare(manual,built));   //compare manual and built-in
    }
}
