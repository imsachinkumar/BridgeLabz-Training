import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // Taking Size of the array
        int[] arr = new int[n];            // Taking array input

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Using for Loop to check each element
        for (int i = 0; i < n; i++) {
            int count = 0;    // Counting occurrences of element

            // Counting how many times arr[i] appears
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // If count is more than n/2,then it will be majority element
            if (count > n / 2) {
                System.out.println("Majority Element is: " + arr[i]);
                return;                    // Exit after finding majority
            }
        }

        // If no majority element found
        System.out.println("There is no Majority Element");
    }
}
