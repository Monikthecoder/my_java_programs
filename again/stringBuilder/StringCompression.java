/**
 * 
 *  *                   AMAZON
 * 
 * String Compression

"aaabbcccdd"

"a3b2c3d2"
 * 
 *  * why it is time complexity is gonna be the o(n) and why not o(n^2) ?
 *    *  because our i is getting increare by 1 and still in the while loop it is going for the same thing increament by 1 
 */

class StringCompression {

    public static String hashedString(String unhashedString) {

        StringBuilder hashedString = new StringBuilder("");
    
        for(int i = 0; i < unhashedString.length();i++) {
            Integer count = 1;
            char ch = unhashedString.charAt(i);
            hashedString.append(ch);

            while (i < unhashedString.length() - 1 && unhashedString.charAt(i) == unhashedString.charAt(i+1)) {
                count++;
                i++;
            }

            if(count > 1) {
                count.toString();
                hashedString.append(count);
            }

        }

        return hashedString.toString();
    }

    public static void main(String[] args) {
        String unhashedString = "aaabbcccdd";
        System.out.println("final string is " + hashedString(unhashedString));
    }

}