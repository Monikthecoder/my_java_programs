
import java.util.*;
class SwapNumbers {
    public static void swap(ArrayList<Integer> list, int idx1 , int idx2) {
            int temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        

        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);

        int idx1 = 1;
        int idx2 = 3;
        System.out.println(numbers);
       swap(numbers, idx1, idx2);

       // ascending order 
        Collections.sort(numbers);
        System.out.println(numbers);
        

        // dscending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}