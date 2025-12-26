import java.util.*;
public class NumberChecker{
    //Method to find count of digits
    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }
    //Method to store digits in array
    public static int[] storeDigits(int number){
        int size=countDigits(number);
        int[] digits=new int[size];
        for(int i=size-1;i>=0;i--){
            digits[i]=number%10;
            number/=10;
        }
        return digits;
    }
    //Method to check duck number
    public static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0){
                return true;
            }
        }
        return false;
    }
    //Method to check Armstrong number
    public static boolean isArmstrong(int number,int[] digits){
        int power=digits.length;
        int sum=0;

        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i],power);
        }

        return sum==number;
    }
    //Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<digits.length;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        return new int[]{largest,secondLargest};
    }
    //Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]<smallest){
                secondSmallest=smallest;
                smallest=digits[i];
            }else if(digits[i]<secondSmallest && digits[i]!=smallest){
                secondSmallest=digits[i];
            }
        }
        return new int[]{smallest,secondSmallest};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int digitCount=countDigits(number);
        int[] digits=storeDigits(number);
        System.out.println("Count of digits: "+digitCount);
        System.out.print("Digits: ");
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
        System.out.println("Is Duck Number: "+isDuckNumber(digits));
        System.out.println("Is Armstrong Number: "+isArmstrong(number,digits));

        int[] large=findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: "+large[0]);
        System.out.println("Second largest digit: "+large[1]);
        int[] small=findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: "+small[0]);
        System.out.println("Second smallest digit: "+small[1]);
        sc.close();
    }
}
