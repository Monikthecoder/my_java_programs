
import java.util.Arrays;
import java.util.Comparator;




/** *
 *                  * FRACTIONAL KNAPSACK (MOST ASKED QUESTION OF ALL TIME )
 *
 * * Fractional Knapsack
 * Given the weights and values of N items, put these items in a knapsack of
 * capacity W to get the maximum total value in the knapsack.

 *  value = [60, 100, 120]
 * weight = [10, 20, 30]

 *  W = 50

 * ans = 240 the thing is that we need higher ratio  = high value / low weight that would be our ratio

 v / w =>  4 , 5 , 6 => we will traverse from the end of an array then my first element would be 6 , 5 , 4 
 *
 */

class Question2 {

   
    
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int w = 50;
        // in knapsack we uses matrix to solve the problem and later inhanced by the DP 
        double[][] ratio = new double[val.length][2];

        // add the element track index and due to solving problem we are using v/w otherwise it is based on the application of math field

        // we are not reversing it cause we can use without reversing then that's why we are using the loop it varries to the 
        // problems
        for(int i = 0; i < ratio.length;i++) {
                    ratio[i][0] = i;
                    ratio[i][1] = val[i]/(double)weight[i];
        }

        // ascending order sorting 
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w ;
        int finalVal = 0;
       for(int i = ratio.length - 1 ; i >= 0; i--) {
            int index = (int) ratio[i][0];

            if(capacity >= weight[index]) {
                finalVal += val[index];
                capacity -= weight[index];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
       }
        System.out.println("final value is :" + finalVal);
    }
}
