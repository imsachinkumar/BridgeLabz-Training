public class BubbleSort{

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 60, 55, 92};
        int n = marks.length;
        boolean swapped;
        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If current mark is greater than next, swap them
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        // Print sorted student marks
        System.out.println("Student Marks in Ascending Order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
