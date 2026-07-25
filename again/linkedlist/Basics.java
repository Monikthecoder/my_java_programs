
public class Basics {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        // Node node = new Node(3);
        Basics ll = new Basics();

        ll.head = new Node(4);
        ll.head.next = new Node(5);

    }
}
