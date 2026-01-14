import java.util.*;
public class SortStackUsingRecursion {
    // Method to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        // Recursively sort remaining stack
        sortStack(stack);
        // Insert removed element at correct position
        insertSorted(stack, top);
    }
    private static void insertSorted(Stack<Integer> stack, int element) {
        // If stack is empty or element is greater than top, push it
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
            return;
        }
        // Otherwise, remove top and recur
        int top = stack.pop();
        insertSorted(stack, element);
        // Push the removed element back
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
