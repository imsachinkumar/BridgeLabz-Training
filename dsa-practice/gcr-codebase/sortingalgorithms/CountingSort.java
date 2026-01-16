public class CountingSort{
    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 14, 18, 11, 15};
        countingSort(ages, 10, 18);
        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
    static void countingSort(int[] arr, int min, int max) {

        int range = max - min + 1;
        int[] count = new int[range];
        // Store frequency of each age
        for (int age : arr) {
            count[age - min]++;
        }

        int index = 0;
        // Rebuild sorted array
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }
}
