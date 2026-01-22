import java.util.*;
public class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();
        // Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        // Move back from stack to queue (reversed order)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(reverseQueue(q));
    }
}
