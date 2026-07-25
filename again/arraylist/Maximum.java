
import java.util.ArrayList;

class Maximum {

    // public static int findMaximum(ArrayList<Integer> numbers) {
    //      int maximum = Integer.MIN_VALUE;
    //     for (int i = 0; i < numbers.size(); i++) {
    //         if(maximum < numbers.get(i)) {
    //             maximum = numbers.get(i);
    //         }
    //     }
    //     return maximum;
    // }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        

        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);
 
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.size(); i ++) {
            if(max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }




    }
}