class  Question1 {
    public static Boolean isDistinct(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,5,3,4};

        if(isDistinct(numbers)) {
            System.out.println("the numbers are not distinct");
        }
        else {
            System.out.println("the numbers are distinct");
        }
    }
}