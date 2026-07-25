
class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,5};

        int index = 1;
        int missing_number = 0;

        while(index != numbers.length - 1) {

            if(index != numbers[index] ) {
                missing_number = index;
            }
            index++;

        }
        System.out.println("missing number is" + missing_number);
    }
}
