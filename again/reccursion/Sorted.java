class Sorted {

    public static boolean isSorted(int[] nums, int i) {
        if(i == nums.length - 1) {
            return true;
        }

        if(nums[i] > nums[i+1]) {
            return false;
        }
    
        return isSorted(nums, i+1);
    }

    // by apna college

    public static boolean byapnacollege(int[] nums , int i) {

        if(i == nums.length - 1) {
            return true;
        }

        if(nums[i] > nums[i+1]) {
            return false;
        }

        return byapnacollege(nums, i+1);
    }
    public static void main(String[] args) {
        int[] nums = {3};
        if(isSorted(nums, 0)) {
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }

        System.out.println("by apna college : " + byapnacollege(nums, 0));
    }
}