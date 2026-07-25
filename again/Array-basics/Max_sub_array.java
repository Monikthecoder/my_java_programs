/*              TIME COMPLEXITY :- O(N3) */
class Max_sub_array {

    public static int maxsubarray(int[] numbers) {
        int max = Integer.MIN_VALUE;  // -infinity
        int current_sum ;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                current_sum = 0;
                for (int k = i; k <= j; k++) {
                    current_sum += numbers[k];
                }
                if (max < current_sum) {
                    max = current_sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // System.out.println("it is working for while");
        int[] numbers = {1, -2, 6, -1, 3};
        System.out.println("the maximum sub array sum is " + maxsubarray(numbers));
    }
}
