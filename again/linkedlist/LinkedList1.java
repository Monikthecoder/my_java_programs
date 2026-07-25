
public class LinkedList1 {

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
    public static int size;

    public void AddFirst(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null && tail == null) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int position, int data) {
        Node temp = head;
        int index = 0;
        Node newNode = new Node(data);

        size++;

        if (position == 0) {
            AddFirst(data);
            return;
        }

        //  1    <   1 - 1
        while (index < position - 1) {
            temp = temp.next;
            index++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void removeFirst() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }

        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            tail = head = null;
            size = 0;
        }
        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;

        tail = temp;

        size--;

    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        //
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.AddFirst(5);
        list.AddLast(6);
        list.addMiddle(2, 9);
        // list.removeFirst();
        list.removeLast();

        // printed the linked list by my self
        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("total size is :" + list.size);
    }
}
