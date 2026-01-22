import java.util.*;
public class RotateList {
    public static List<Integer> rotateList(List<Integer> list, int k) {

        List<Integer> result = new ArrayList<>();
        int n = list.size();
        k = k % n; // handle large rotation values

        // Add elements from index k to end
        for (int i = k; i < n; i++) {
            result.add(list.get(i));
        }
        // Add elements from start to k-1
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(rotateList(list, 2));
    }
}
