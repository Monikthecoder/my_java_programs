
class Pair {

    public static void pair(int[] numbers) {
        for(int i=0;i< numbers.length;i++) {
            for(int j = i+1; j < numbers.length ; j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        pair(numbers);
        // for (int idx = 0; idx < numbers.length; idx++) {
        //     System.out.println(numbers[idx]);
        // }
    }
}
