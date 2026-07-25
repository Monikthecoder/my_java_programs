
/**
 *
 *                                   * FLIPCART , DENZO
 *
 *      *Container with Most Water
 **For given n lines on x-axis, use 2 lines to form a container such
 **that it holds maximum water.
 **height = [1,8,6,2,5,4,8,3,7]
 *
 *
 *
 */

import java.util.*;

class ContainerWithMostWater {

    public static int mostwater(ArrayList<Integer> list) {
        int pointer1 = 0;
        int pointer2 = list.size() - 1;
        int Maxwater = Integer.MIN_VALUE;

        while(pointer1 < pointer2) {
            int area = Math.min(list.get(pointer1), list.get(pointer2)) * (pointer2 - pointer1);

            if(Maxwater < area) {
                Maxwater = area;
            }

            if(list.get(pointer1) < list.get(pointer2)) {
                pointer1++;
            }
            else {
                pointer2--;
            }
        }
        
        // }

        // for(int i =0; i < list.size();i++) {
        //     for(int j = i+1 ; j < list.size();j++) {

        //         int height = Math.min(list.get(i), list.get(j));
        //         int width = j - i;

        //         int water = height * width;
        //         System.out.println("water : " + water);
        //         if(Maxwater < water) {
        //             Maxwater = water;
        //         }
        //         System.out.println("Maximum water : " + Maxwater);
        //     }
        // }
        return Maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(mostwater(list));

    }
}
