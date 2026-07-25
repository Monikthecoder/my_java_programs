


/**
 * Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is
equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to
the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
Input : [1,7,3,6,5,6]
Output: 3

suppose we are on the index 3 then we know that
1 + 7 + 3 = 11
5 + 6 = 11

and our answer is 6 and index is 3 thus we will return  index = 3.



 */

class PivotTable {
    public static void main(String[] args) {
        int Ls = 0;
        int TS = 0;
        int Rs;
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 7;
        nums[2] = 3;
        nums[3] = 6;
        nums[4] = 5;
        nums[5] = 6;
        // System.out.println(nums.length);
        for (int i = 0 ; i < nums.length; i++) {
            TS+=nums[i];
        }
        // System.out.print(TS);
        for(int j = 0; j < nums.length;j++) {
            Rs = TS - Ls - nums[j];
             if (Ls == Rs) {
                System.out.print(j);
            }
            Ls = Ls + nums[j];
        }

    }
}