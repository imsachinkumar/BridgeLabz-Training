import java.util.Scanner;
public class MaxOfThree{
    static int[] takeInput(Scanner sc){
        int[] a=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter number "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        return a;
    }
    // Finds and returns the maximum of three numbers

    static int findMax(int a,int b,int c){
        int max=a;          // assume first number is maximum
        if(b>max) max=b;   // compare with second number
        if(c>max) max=c;   // compare with third number
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums=takeInput(sc);
        int result=findMax(nums[0],nums[1],nums[2]);
        System.out.println("Maximum number: "+result);
        sc.close();
    }
}
