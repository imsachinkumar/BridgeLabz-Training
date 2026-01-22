import java.util.*;
public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();
        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                return null; // N greater than list size
            }
            first.next();
        }
        // Move both pointers together
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(findNthFromEnd(list, 2));
    }
}
