class QueueB {
     static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }
        // static int front = rear+1;

        public static boolean isEmpty() {
            return rear == -1;
        }
        
        public static void add(int data){
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear+1] = data;
        }
        public static int remove() {
            if(rear  == -1) {
                System.out.println("no elements found in the queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
            }
            return arr[0];
        }

        public static void print() {
            if(rear == -1) {
                System.out.println("no elements to print");
                return;
            }
            // int temp = front;
            for (int i = 0; i <= rear; i++) {

                System.out.println(arr[i]);
                
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(10);
        q.print();
        q.add(20);
        q.add(40);
        q.add(50);
        q.print();
    }
}
