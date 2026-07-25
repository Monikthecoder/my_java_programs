class JumpGame {
    public static  boolean canJump(int[] nums) {
        int start = nums[0];
        int end = nums.length;
        int i = 0;
        while(i <= start) {
            i++;
        }
        if( i == (end - i + 1)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};

        System.out.println("can jump :" + canJump(nums));
    }
}