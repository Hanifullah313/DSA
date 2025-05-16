import java.util.*;

public class CFQ {
    public static void main(String[] args) {
        // Using LinkedList to implement a Queue (FIFO behavior)
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Displaying the queue elements
        System.out.println("Queue elements:");
        for (int num : queue) {
            System.out.print(num + " -> ");
        }
        System.out.println("null");  // End of queue
    }
}