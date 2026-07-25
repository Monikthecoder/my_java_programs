
import java.util.LinkedList;
import java.util.Queue;

/**
 *      * INTUIT * Implement a stack using two queues
 *
 * in the queue we have perfect order like the 1 2 3 but in the stack that order
 * will be 3 2 1 how we remove the element in the stack is top ones so what we
 * can do is first one we have an add and remove operation in the queue to work
 * with and in the stack same but the order differes
 *
 * first how i will add if i add 5 , 7 , 8x then in the queue it will be the
 * same order now i want is 8 7 5
 */
class Question2 {

    static class Stack {

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int remove() {
            int top = -1;
            if (isEmpty()) {
                return top;
            }

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(20);
        s.push(30);
    }
}
