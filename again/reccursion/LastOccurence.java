class LastOccurence {

    public static int lastOccurence(int[] nums , int key , int i) {
        if(i < 0) {
            return -1;
        }

        if(nums[i] == key) {
            return i;
        }

        return lastOccurence(nums, key, i--);
    }

    // by apna college

    public static int byapnacollege(int[] nums , int key , int i) {

        if(i == nums.length) {
            return -1;
        }
        
        int isFound = byapnacollege(nums, key, i++);

        if(isFound == -1 && nums[i] == key) {
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int[] nums = {8,3,6,9,5,10,2,5,3};
        int key = 5;

        // System.out.println("last occurence at index :" + lastOccurence(nums, key, nums.length));
        System.out.println(byapnacollege(nums, key, 0));
    }
}