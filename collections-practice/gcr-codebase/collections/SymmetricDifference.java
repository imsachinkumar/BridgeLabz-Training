import java.util.*;
public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> result = new HashSet<>(set1);

        // Add elements unique to set2
        for (int value : set2) {
            if (!result.add(value)) {
                result.remove(value); // remove common elements
            }
        }
        System.out.println(result);
    }
}
