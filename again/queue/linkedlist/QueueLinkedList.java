/**
 *                      *  MICROSOFT
 ** IMMPLEMENT A QUEUE USING A LINKED LIST
 */

class QueueLinkedList {

        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public static Node head = null;
        public static Node tail= null;
        static class Queue {

            public static boolean isEmpty() {
                return head == null && tail == null;
            }
            public static void add(int data) {
                Node newNode = new Node(data);
                if(isEmpty()) {
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            public static void remove() {
                if(isEmpty()) {
                    System.out.println("queue is empty");
                    return;
                }
                // when we have only one element in the queue
                if(head == tail) {
                    head = tail = null;
                    return;
                }
                head = head.next;
            }

            public static void peek() {
                if(isEmpty()) {
                    System.out.println("queue is empty");
                }
                System.out.println(head.data);
            }
        }

    public static void main(String[] args) {
        
    }

}