// we are using the perfix sum patterns to solve this kind of questios in the future and this is only used for the maxsub arrays and
//                                          PREFIX PATTERN IN JAVA

/**
 * how to use prefix pattern
 * we use prefix array which calculates the sum of the numbers array before approaching the problem
 * first calculate the whole sum of the given array and store it in the prefix array
 * then we track the current sum by using the formula which is prfix[end (j =>  end index)] - prefix[start-1 ( i => start index)]
 *
 * that is how we track the formula and get the current sum and then we compare it with the max sum if max sum is less then current sum then update max sum with current sum
 * After get out of the loop
 *  then return the maxsum
 *
 *          TIME COMPLEXITY :- O(N2)
 */
class MaxSubArrayCC {
    public static int maxsubarray(int[] numbers) {
       int curSum;
       int MaxSum = Integer.MIN_VALUE;
       int[] prefix = new int[numbers.length];

        // calculating prefix array sum and stroing into it
        prefix[0] = numbers[0];

        for(int i = 1; i < prefix.length;i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        // main logic starts from here

       for(int i=0; i < numbers.length;i++) {
        for(int j = i; j < numbers.length;j++) {
            curSum = i==0 ? prefix[j] :  prefix[j] - prefix[i-1];

            if(MaxSum < curSum) {
                MaxSum = curSum;
            }
        }
       }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        int result = maxsubarray(numbers);
        System.out.println("maximum sum is " + result);
    }
}



