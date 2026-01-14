import java.util.*;
public class QueueUsingStacks {
    // Stack  for enqueue operation
    private Stack<Integer> stackIn;
    // Stack  for dequeue operation
    private Stack<Integer> stackOut;
    public QueueUsingStacks() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    // Enqueue operation 
    public void enqueue(int data) {
        stackIn.push(data);
        System.out.println(data + " enqueued");
    }
    // Dequeue operation
    public int dequeue() {
        // If both stacks are empty, queue is empty
        if (stackIn.isEmpty() && stackOut.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        // If stackOut is empty
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        // Pop from stackOut
        return stackOut.pop();
    }
    // Display front element of queue
    public int peek() {
        if (stackIn.isEmpty() && stackOut.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
