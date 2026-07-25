
/**
 *
 *                      KADAN'S ALGORITHM
 *
 * IF YOU ADD POSITIVE NUMBER WITH THE ANOTHER POSITIVE NUMBER THEN YOU WILL GET POSITIVE NUMBER
 *  BUT IF YOU ADD SMALL POSITIVE NUMBER WITH LARGE NEGATIVE NUMBER THEN THE SITUATION IS NOT FOVARABLE
 *
 * THEN KADAN SAID THAT WE DO NOT NEED THE NEGATIVE VALUES INSTEAD WE WILL TAKE THEM AS ZERO OR WE WILL REPLACE NEGATIVE VALUES WITH THE ZERO
 *
 */

class KadenSubArray {

    public static int subarray(int[] numbers) {
        int current_sum = numbers[0];
        int max_sum = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {

            if (current_sum < 0) {
                current_sum = 0;
            }
            current_sum += numbers[i];

            if (max_sum < current_sum) {
                max_sum = current_sum;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
        int results = subarray(numbers);

        System.out.println("the maximum sum using the kadan's algorithm " + results);

    }
}
