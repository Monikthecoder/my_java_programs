
import java.util.ArrayList;

class Reverse_List {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);   
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.err.println(list.size()); 
         for (int idx = list.size() - 1; idx >= 0 ; idx--) {
            System.out.println(list.get(idx) + " ");
         }
         System.out.println(" ");
    }
}