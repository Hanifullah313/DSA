public class LLQueue {

    // Node class for queue elements
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue implemented using linked list
    static class Queue {
        Node head = null;
        Node tail = null;

        // Check if queue is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Add element to the queue
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Remove element from the queue
        public int delete() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1; // Return an invalid value or throw exception
            }

            int front = head.data;
            head = head.next;

            if (head == null) {
                tail = null; // If queue becomes empty
            }

            return front;
        }

        // Print the queue
        public void printQueue() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.printQueue(); // Expected: 10 -> 20 -> 30 -> 40 -> null

        System.out.println("Deleted: " + q.delete());
        q.printQueue(); // Expected: 20 -> 30 -> 40 -> null
    }
}
