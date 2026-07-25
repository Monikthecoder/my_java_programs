
// Approach - 1 :- queue
/**
 * Approach - 2 :- dequeue
 *      instead of inserting the single element into the queue we will insert the double element 
 *      to avoid the problem of duplication
 *   
 */
import java.util.*;

class Pair {

    int timeStamp;
    int freq;

    public Pair(int x , int y) {
        timeStamp = x ;
        freq = y;
    }

    int getFirst() {
        return timeStamp;
    }

    int getSecond() {
        return freq;
    }

}

class hitCounter {

    private int total;
    private final  Deque<Pair>dq;

    public hitCounter() {
        total = 0;
        dq = new LinkedList<Pair>();
    }

    public void hit(int timeStamp) {

        if(dq.isEmpty() || dq.getLast().getFirst() != timeStamp) {
            dq.add(new Pair(timeStamp, 1));
        }
        else {
            int freq = dq.getLast().getSecond();
            dq.removeLast();
            dq.add(new Pair(timeStamp,freq + 1));
        }
        total++;
    }

    public int getHits(int timeStamp) {
            while(!dq.isEmpty()) {
                int first = dq.getFirst().getFirst();

                if(timeStamp - first >= 300) {

                    total -= dq.getFirst().getSecond();
                    dq.removeFirst();
                }
                else {
                        break;
                }
                
            }
            return total;
    }
}

public class HitCounter {
    public static void main(String[] args) {
        hitCounter obj = new hitCounter();

        obj.hit(1);
        obj.hit(2);
        obj.hit(3);
        obj.hit(4);

        System.out.println(obj.getHits(300));
        System.out.println(obj.getHits(301));
    }
}