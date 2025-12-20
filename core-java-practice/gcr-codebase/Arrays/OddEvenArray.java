import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number: "); //Taking Input
        int number=sc.nextInt();
        if(number<=0){                     // If number is negative then it is invalid
            System.out.println("Invalid input");
            return;
        }

        int[] even=new int[number/2+1];   //Array for Even
        int[] odd=new int[number/2+1];    //Array for Odd

        int eIndex=0,oIndex=0;

        for(int i=1;i<=number;i++){
            if(i%2==0){                   //if i%2 ==0 means even
                even[eIndex++]=i;
            }else{
                odd[oIndex++]=i;          // else odd
            }
        }
        System.out.println("Odd Numbers:");
        for(int i=0;i<oIndex;i++){               
            System.out.print(odd[i]+" ");
        }

        System.out.println("\nEven Numbers:");
        for(int i=0;i<eIndex;i++){
            System.out.print(even[i]+" ");
        }
        sc.close();
    }
}
