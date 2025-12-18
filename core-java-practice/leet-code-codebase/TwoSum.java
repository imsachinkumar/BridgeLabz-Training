import java.util.*;

public class TwoSum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input for size 

        System.out.println("Enter size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements

        System.out.println("Enter array elements");
        for (int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        // Taking Input for target value

        System.out.print("Enter target ");
        int trgt = sc.nextInt();

        // Checking for all pairs

        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {

                // If sum of those values matches with target

                if (arr[i] + arr[j] == trgt) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }

        //if pair not found
        System.out.println("No two sum found");
    }
}
