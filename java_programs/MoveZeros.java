
/*

maintain relative order of the Array number and move all zeros to the right without using Extra Array or vector.
input :- [0,1,0,3,12]
output :- [1,3,12,0,0]

Relative order :- it means the way in the numbers are given if in the Array [12,3,1] then [12,3,1,0,0]

In these kind of problems we will use Two pointer method where we will keep track and then swap between zeros and numbers.

*/
class MoveZeros {
    public static void main(String args[]) {
        int[] nums = new int[6];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 0;
        nums[3] = 3;
        nums[4] = 0;
        nums[5] = 12;

        int p1,p2;
        p1 = 0;
        p2 = 0;
        int temp;
        for(int i =0; i < nums.length -1 ; i++) {
            if(nums[p2] > 0 || nums[p2] == 0 && nums[p1] == 0) {
                temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
            }
            p2++;

        }

        for(int j=0; j< nums.length-1;j++) {

            System.out.println(nums[j]);

        }

    }
}