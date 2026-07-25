
import java.util.*;
/*
Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the
duplicates in-place such that each unique element appears only once.

Return k after placing the final result in the first k slots of nums.

Input: nums = [0,1,1,1,2,2,3]
Output: 4
*/
//  two approcches :- hash table and two pointer 

class  untitled {
    public static int removeDuplicates(int[] nums) {
        int k=0;
         int i=0;
        int j = i+1;
        for(int idx=0;idx<=nums.length;idx++) {

            if(nums[i]!=nums[j]) {
              k++;
              i++;
              j++;
            }
            i++;
            j++;
            
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = new int[6];
       
        Scanner scan = new Scanner(System.in);

        for (int inp = 0; inp <= nums.length -1; inp++) {
            System.out.print("Enter at the index" + inp + " :");
            nums[inp] = scan.nextInt();
        }
        
        // for(int c =1; c<nums.length;c++) {
        //     System.out.println(nums[c]);
        // }
        System.out.println("Now this is my results");
        int results = removeDuplicates(nums);
        System.out.println(results);
        }

    }