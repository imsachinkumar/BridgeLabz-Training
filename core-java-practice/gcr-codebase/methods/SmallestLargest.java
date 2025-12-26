import java.util.*;
public class SmallestLargest{
    public static int[] findSmallestAndLargest(int a,int b,int c){  //Method to calculate smallest and largest
        int small=Math.min(a,Math.min(b,c)); //Inbuilt method
        int large=Math.max(a,Math.max(b,c));
        return new int[]{small,large};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int[] result=findSmallestAndLargest(a,b,c); //Method calling
        System.out.println("Smallest: "+result[0]);
        System.out.println("Largest: "+result[1]);
        sc.close();
    }
}
