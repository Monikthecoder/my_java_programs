
import java.util.ArrayList;

class Multi {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(20);
        list1.add(30);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(44);
        list2.add(56);

        mainList.add(list2);

        System.out.println(mainList);

        // how to print ArrayList (2D) 

        for(int i=0; i < mainList.size();i++) {
            ArrayList<Integer> temp = mainList.get(i);

            for(int j = 0 ; j < temp.size(); j ++) {
                System.out.println(temp.get(j));
            }

        }
    }
}
