
    
public class CQArr {
    public static class CircularQueue {
        int[] arr;
        int size;
        int front = -1;
        int rear = -1;

        CircularQueue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // First element
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % size;
            }

            arr[rear] = data;
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // Single element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);  // Queue is now full
        q.add(60);  // Should print "Queue is full"

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        q.add(70);  // Now we can add after dequeuing
        System.out.println("After re-adding:");
        System.out.println(q.peek());  // 70
    }
}

