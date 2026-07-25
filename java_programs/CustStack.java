
import java.util.Stack;

/**
 * design a custom stack with increment operation 
 * implement the CustomStack class and do the following : 
 * 
 *  CustomStack(int maxSize) => it will be constructer initilize the object with maxSize
 *  which is the maximum number of the element in the stack 
 * 
 * void push(int x) => Adds x to the top of the stack if the stack has not reached the maxSize
 * 
 * int pop() => Pops and returns the top of the stack or -1     if the stack is empty 
 * 
 * void inc(int k , int val) => increments the bottom K elements of the stack by val. if there
 * are less than  K  elements in the stack , increment all the elements in the stack
 * 
 * input :- ["CustomStack","push","push","pop","push","increment","pop","push"]
 *             [[3],[1],[2],[],[2],[2,100],[],[6]]
 * 
 * output :- [null , null , null , 2 , null , 102 , null]
 * 
 * 
 * 
 * TIME COMPLEXITY = O(N)
 * SPACE COMPLEXITY = O(N)
 */

class customStack {
    private int cursize;
    private int max_size;

   private  Stack<Integer> s1;
    private Stack<Integer> s2;

    public customStack(int maxsize) {
        cursize = 0;
        max_size = maxsize;
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if(cursize < max_size) {
            s1.push(x);
            cursize++;
        }
        
    }

    public int pop() {

        if( cursize == 0) {
            return -1;
        }

        cursize--;
        return s1.pop();
    }

    public void  increment(int k , int val) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        while((s2.size() != 0) && (k>0)) {
            s1.push(s2.pop()+val);
            k--;
        }

        while(s2.size() != 0) {
            s1.push(s2.pop());
        }
    }


}

 class CustStack {
    public static void main(String[] args) {
        customStack cstack = new customStack(3);
        cstack.push(1);
        cstack.push(3);
        cstack.push(4);
        cstack.increment(2, 100);

        System.out.println(cstack.pop());
        System.out.println(cstack.pop());
    }
}



