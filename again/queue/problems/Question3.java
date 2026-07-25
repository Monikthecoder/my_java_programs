
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 *          *      FLIPCART
 * * first non-repeating character letter in a stream of characters. (in the main question it uses strings)
 * * a a b c c x b
 * * ans :- x 
 * * constraints :- no uppercase characters 
 */
class Question3 {

    public static void non_repeating_letter(char[] characters) {

        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for(int i = 0; i < characters.length;i++) {

            freq[characters[i] - 'a']++;
            
            if(freq[characters[i] - 'a'] <= 1) {
                q.add(characters[i]);
            }
            else {
                q.remove(characters[i]);
            }   
        }
        if(q.isEmpty()) {
            System.out.println(-1);
            return;
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        char[] characters = {'a','a','b','c','c','x','b'};

        non_repeating_letter(characters);

    }
}