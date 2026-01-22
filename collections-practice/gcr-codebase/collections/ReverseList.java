import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();

        // Traverse list from end to start
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Example with ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reverseList(arrayList));

    }
}
