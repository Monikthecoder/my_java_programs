
class FirstOccurance {

    public static int firstOccurance(int[] nums, int key, int i) {

        if (nums.length  == i) {
            return -1;
        }

        if (nums[i] == key) {
            return i;
        }

        return firstOccurance(nums, key, i + 1);

    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 5, 7, 8, 9, 5, 10,75};
        int key = 75;
        System.out.println(firstOccurance(nums, key, 0));
    }
}
