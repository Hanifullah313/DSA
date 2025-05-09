public class LLreverseIterte {
    Node head;
    private int size;

    // LLreverseIterte() {
    // size = 0;
    // }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first , last
    public void adddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void adddlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        size--;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deletelast() {
        size--;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = secondLast.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize() {
        return size;
    }

    // reverse iterate
    public void reverseiterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node CurrNode = head.next;
        while (CurrNode != null) {
            Node NextNode = CurrNode.next;
            CurrNode.next = prevNode;
            // update
            prevNode = CurrNode;
            CurrNode = NextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LLreverseIterte list = new LLreverseIterte();
        list.adddFirst("is ");
        list.adddFirst("linked list ");
        list.adddlast("now");
        list.adddlast("ready ");
        list.printList();
      //  list.deleteFirst();
      //  list.printList();
      //  list.deletelast();
      //  list.printList();
      //  System.out.println(list.getsize());
        list.reverseiterate();
        list.printList();
    }
}
