
// import java.util.Arrays;

// class BinarySearch {

//     public static int BinarySearch(int[] dictionary, int key) {

//         int middle = dictionary.length / 2;
//         int index;
//         // int size = dictionary.length;

//         while (key < middle) {

//             index = middle;

//             if (dictionary[index] == key) {
//                 System.out.print("index is :" + index);
//                 return dictionary[index];
//             }

            
//                 index++;
        
//         }
//         while (key > middle) {

//             index = middle;

//             if (dictionary[index] == key) {
//                 System.out.print("index is :" + index);
//                 return dictionary[index];
//             }
//             index--;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] dictionary = {20, 55, 60, 90, 110, 40, 70};
//         int key = 110;
//         Arrays.sort(dictionary);
//         int result = BinarySearch(dictionary, key);

//         System.out.println(result);
//     }
// }



/**
 * 
 * APNA COLLEGE CODE OF THE BINARY SEARCH 
 * IN BINARY SEARCH WE HAVE A APPROACH FOR THE KEEPING TRACK OF THE START AND AN END 
 * SO THAT WE DO NOT LOSE THE TRACK OF THE INDEXS ALSO IT DOES NOT BOUND THE INDEXES
 * WE WILL KEEP SHORT THE WINDOW OF THE BINARY AND KEEP UPDATE OUR START AND AN END OF THAT WINDOW 
 * 
 * PSEDUO CODE :- 
 * start=0, end=n-1

while(start <= end)

find mid

compare mid & key

mid == key

mid > key   FOUND 

mid + 

FOUND

LEFT

DIOUT
 */