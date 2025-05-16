import java.util.*;

public class Q2stack {

    // Queue implemented using two stacks
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Check if queue is empty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element to the queue
        public void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push new element onto s1
            s1.push(data);

            // Push everything back to s1 from s2
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();  // CORRECT: pop removes the front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);  // Not full, dynamic stack

        // Remove and print elements
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
