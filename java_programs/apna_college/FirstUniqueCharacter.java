//  the string given s , find the first non-repeating character in it and return its index. If it does not exist, return -1.
// constraints : 1 <= s.length <= 10^5
// s consists of only lowercase English letters.

import java.util.*;
class FirstUniqueCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int arr[] = new int[26];
            for(int i = 0; i < 26 ; i++) {
                arr[i] = 0;
            }
            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            int ans = -1;
            for(int i = 0; i < s.length(); i++) {
                if(arr[s.charAt(i) - 'a'] == 1) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}