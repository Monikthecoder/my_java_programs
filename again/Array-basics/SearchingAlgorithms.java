class SearchingAlgorithms {

    public static int LinearSearch(int[] arr, int key) {
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == key) {
                return arr[idx];
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 60;
        int result = LinearSearch(arr,key);
        System.out.println(result);
    }
}