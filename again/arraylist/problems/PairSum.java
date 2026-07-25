
import java.util.ArrayList;

/**
 * Pair Sum - 1 Find if any pair in a Sorted ArrayList has a target sum.
 *
 *  *list = [1, 2, 3, 4, 5, 6], target=5
 */
class PairSum {
    // Brute-force

    public static void sumofpairs(ArrayList<Integer> pair, int target) {
        for (int i = 0; i < pair.size(); i++) {
            for (int j = i + 1; j < pair.size(); j++) {
                if (pair.get(i) + pair.get(j) == target) {
                    System.out.println("the sum can happen of :" + pair.get(i) + " " + pair.get(j));
                }
            }
        }

    }
    // two pointer approach

    public static int pointerapproach(ArrayList<Integer> pair, int target) {
        int start = 0;
        int end = pair.size() - 1;

        while (start < end) {
            if (pair.get(start) + pair.get(end) == target) {
                System.out.print(pair.get(start) + " " + pair.get(end));
                System.out.println(" ");
                return 1;
            } else if (pair.get(start) + pair.get(end) < target) {
                start++;
            } else {
                end--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);
        sumofpairs(pair, 5);
        System.out.println(pointerapproach(pair, 5));
    }
}
