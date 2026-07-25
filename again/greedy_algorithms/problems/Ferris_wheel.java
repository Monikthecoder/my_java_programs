
/**
 * There are n children who want to go to a Ferris wheel, and your task is to find a gondola for each child.
 * Each gondola may have one or two children in it, and in addition, the total weight in a gondola may not exceed x. You know the weight of every child.
 * What is the minimum number of gondolas needed for the children?
 * Input
 * The first input line contains two integers n and x: the number of children and the maximum allowed weight.
 * The next line contains n integers p_1,p_2,\ldots,p_n: the weight of each child.
 * Output
 * Print one integer: the minimum number of gondolas.
 * Constraints
 *

 *  *Example
 * Input:
 * children = 4  x = 10
 * weight = 7 2 3 9

 *  *Output:
 * 3
 *
 */
import java.util.*;
class Ferris_wheel {

    public static void main(String[] args) {
        int n = 4;
        int[] weight = {2, 3, 4, 5};

        int x = 7;
        int currentWeight = 0;
        int minimumGondola = 0;

        Arrays.sort(weight);
        int k = 0;
        while (n > 0) {
            currentWeight += weight[k];
            if (currentWeight >= x) {
                minimumGondola++;
                currentWeight = weight[k];
                k++;
                n--;
            } else {
                k++;
                n--;
            }
        }
        System.out.println("minimum required gondola for children is : " + minimumGondola);

        
        /* * correct approach 
        // greedy + two pointers

        // for (int i = 0, j = weight.length - 1; i < j; i++, j--) {
        //     int temp = weight[i];
        //     weight[i] = weight[j];
        //     weight[j] = temp;
        // }

        // int i =0;
        // int j = weight.length -1;
        // int gondola = 0;
        // while(i <= j) {
        //     if(weight[i] + weight[j] <= x) {
        //         gondola++;
        //         i++;
        //         j--;
        //     } else {
        //         gondola++;
        //         j--;
        //     }
        // }
       System.out.println("minimum gondola required" + gondola);
        */ 
    }

}
