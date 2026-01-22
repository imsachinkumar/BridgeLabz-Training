import java.util.*;
public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int value : list) {
            if (!seen.contains(value)) {
                seen.add(value);
                result.add(value);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(list));
    }
}
