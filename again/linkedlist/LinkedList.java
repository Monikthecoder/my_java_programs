public class LinkedList {
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
        LinkedList list = new LinkedList();

        list.head = new Node(20);
        list.tail = list.head;

        list.head.next = new Node(40);
        // list.tail != list.head.next ? list.tail = list.head.next : list.tail;
        
    }
}