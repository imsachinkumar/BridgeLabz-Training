import java.util.*;
public class CheckNumber{
    //check  number is positive or negative
    static boolean isPositive(int num){
        return num>=0;
    }
    // check whether number is even or odd

    static boolean isEven(int num){
        return num%2==0;
    }

    //Method to compare two numbers
    static int compare(int a,int b){
        if(a>b){
            return 1;
        }else if(a==b){
            return 0;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        //Check positive/negative and even/odd

        for(int i=0;i<numbers.length;i++){
            if(isPositive(numbers[i])){
                if(isEven(numbers[i])){
                    System.out.println(numbers[i]+" is positive and even");
                }else{
                    System.out.println(numbers[i]+" is positive and odd");
                }
            }else{
                System.out.println(numbers[i]+" is negative");
            }
        }
        //Compare first and last elements

        int result=compare(numbers[0],numbers[numbers.length-1]);
        if(result==1){
            System.out.println("First element is greater than last element");
        }else if(result==0){
            System.out.println("First and last elements are equal");
        }else{
            System.out.println("First element is less than last element");
        }
        sc.close();
    }
}
