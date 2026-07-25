
import java.util.Stack;

/***
 *                      *       AMAZON
 * * PUSH AT THE BOTTOM OF THE STACK
 */

class Question1 {
    public static  void pushBottom(Stack<Integer> stack , int element) {
        if(stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        pushBottom(stack, element);
        stack.push(top);
    
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        pushBottom(stack, 5);

       System.out.println(stack);
    }
}