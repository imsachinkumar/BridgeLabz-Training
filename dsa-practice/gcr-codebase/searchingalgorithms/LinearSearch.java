public class LinearSearch{
    // Method to find index of first negative number
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Check if current element is negative
            if (arr[i] < 0) {
                return i;
            }
        }
        // Return -1 if no negative number exists
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, -3, 8, -10};
        // Call the method
        int result = findFirstNegative(numbers);
        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found");
        }
    }
}
