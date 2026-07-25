
import java.util.Stack;

/**
 *                      *  GOOGLE , MICROSOFT 
 * * QUEUE USING 2 STACKS 
 * we have to convert the LIFO to FIFO 
 * 
 */

class Question1 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {

            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if(isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(23);
        q.add(30);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}