class LinkedList2 {
    public class Node {
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

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int searchKey(int key) {
        int index=0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) {
                return index+1;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static int recursiveApproach(int key, Node temp,int index) {
        
        if(temp == null) {
            return -1;
        }
        if(temp.data == key) {
            return index+1;
        }
        
        return recursiveApproach(key, temp.next,index+1);
    }

    // by apna college

    public int helper(Node temp,int key) {
        int index = 0;
        temp = head;
        if(temp == null) {
            return -1;
        }
        if(temp.data == key) {
            return index;
        }

        
        return index;
    }

    public int byapnacollege(int key) {
        return -1;
    }
    
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        Node temp = head;

        while(temp != null) {
            System.err.println(temp.data);
            temp = temp.next;
        }
    
        System.out.println("the key found " + searchKey(2));

        System.out.println("the recursive approach " + recursiveApproach(3, list.head,0));

        System.out.println("the size of ll :" + size);


    }
}