
import java.util.ArrayList;
class Maximum_Array_List {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int idx = 0 ; idx < list.size() ; idx++) {
            System.out.println(list.get(idx) + " ");
        }
    }
}