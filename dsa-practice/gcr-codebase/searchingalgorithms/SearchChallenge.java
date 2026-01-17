import java.util.Arrays;
public class SearchChallenge {
    // Linear search for first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        boolean[] present = new boolean[arr.length + 1];
        for (int num : arr) {
            if (num >0 &&num <= arr.length) {
                present[num] = true;
            }
        }
        for (int i=1;i<=arr.length;i++) {
            if (!present[i]) {
                return i;
            }
        }
        return arr.length+1;
    }

    // Binary search for target index
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        System.out.println("Missing Positive: " + firstMissingPositive(arr));

        Arrays.sort(arr);
        System.out.println("Target Index: " + binarySearch(arr, 4));
    }
}
