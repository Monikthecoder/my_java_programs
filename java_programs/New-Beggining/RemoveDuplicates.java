class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {10,20,20,40,50,50};

        int left = 0;
        int unique = 0;
        for(int i= left+1;i < nums.length;i++) {
            if(nums[i] != nums[left]) {
                System.out.println(nums[left]);
                left++;
                nums[left] = nums[i];
                unique++;
            }
            
        }
        System.out.println(nums[left]);
        System.out.println(unique+1);
        
    }
}