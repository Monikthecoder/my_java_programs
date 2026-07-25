
/**
 *
 *                      *  GOOGLE , MICROSOFT
 *      * Problem 12

  **       * Remove Duplicates in a String

  **       *"appnnacollege"
 * /**
 *
 * what happens is that we are gonna store the character a to z into the boolean map if that character appears at the index
 * then we will make it true and this also means that our final string should be the full of unique characters only
 * also how we will make sure that this works without traversing the array ?
 *      * it has formula :- map[index] = our current character - 'a'
 */

class RemoveDuplicates {

    public static String removeDuplicates(String str, int i, int j, StringBuilder sb) {

        if (i == str.length()) {
            return sb.toString();
        }

        if (str.charAt(i) != str.charAt(j)) {
            sb.append(str.charAt(j));
        }

        removeDuplicates(str, i + 1, j + 1, sb);

        return sb.toString();
    }

    public static void removeDuplicatebyapnaCollege(String str , int idx , StringBuilder sb , boolean map[]) {
        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char currentChar = str.charAt(idx);

        if(map[currentChar - 'a'] == true) {
            removeDuplicatebyapnaCollege(str, idx + 1, sb, map);
        }
        else {
            map[currentChar - 'a'] = true;
            removeDuplicatebyapnaCollege(str, idx + 1, sb.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str = "abc";
        System.out.println(removeDuplicates(str, 1, 0, sb));

        // boolean map[] = new boolean[26];
        System.out.println(removeDuplicatebyapnaCollege(str,0, new StringBuilder(""),new boolean[26]));
    }
}
