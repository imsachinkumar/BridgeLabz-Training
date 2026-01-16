public class SelectionSort{

    public static void main(String[] args) {
        int[] scores = {72, 85, 60, 90, 68};
        int n = scores.length;
        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            // Find minimum element
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
