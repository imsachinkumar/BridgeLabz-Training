import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] numbers=new double[10];
        double total=0.0;
        int index=0;
        while(true){
            System.out.print("Enter a number: ");
            double value=sc.nextDouble();
            if(value<=0 || index==10){ //check if value is less than 0 or more than actual then break
                break;
            }
            numbers[index]=value;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for(int i=0;i<index;i++){
            System.out.println(numbers[i]);
            total+=numbers[i];//calculating total sum
        }
        System.out.println("Sum = "+total);
        sc.close();
    }
}
