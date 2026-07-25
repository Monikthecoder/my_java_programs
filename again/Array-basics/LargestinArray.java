// // new challange added :- replace the largest with the zero and print the index that you have changed the maximum number 
// class LargestinArray {
//     public static int LargestElement(int[] arr) {

//         if(arr.length == 0) {
//             return -1;
//         }
//         int max = 0;

//         for(int index = 0; index < arr.length; index++) {
//             if(arr[index] > max) {
                
//                 max = arr[index];
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == max) {
//                 arr[i] = 0;
//                 System.out.println("this is the index of zero :");
//                 return i;
//             }
//         } 
//         return max;
//     }
//     public static void main(String [] args) {
//         int[] numbers = {10,999,50,60,3000};
//         int result = LargestElement(numbers);

//         System.out.println(result);
        
//         for(int i = 0 ; i < numbers.length ; i++) {
//             System.out.println("at the index " + i + "this element " + numbers[i]);
//         }

//     }
// }

// Apna college way of defining and getting the largest and smallest value

/*
think of it as that we are going smallest to the largest so we will use Integer.MIN_VALUE
*/

class LargestinArray {
    public static int Largest(int[] age) {
        int max = Integer.MIN_VALUE; // lowest posibble value in integer (we will replace with the largest element)
        for(int index = 0; index < age.length; index++) {
            if(age[index] > max) {
                max = age[index];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] age = {70,80,90,99,45,79,67};

        int result = Largest(age);

        System.out.print(result);
    }
}