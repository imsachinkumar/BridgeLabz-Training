public class InsertionSort{
    public static void main(String[] args) {
        int[] empIds = {105, 101, 110, 102, 108};
        int n = empIds.length;
        // Insertion Sort logic
        for (int i = 1; i < n; i++) {
            int key = empIds[i];   // element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
