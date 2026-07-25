


class CharAt {

    public static void printcharacter(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.print("the lenght is " + name.length());
    }

    public static void isPalindrome(String name) {

        int count = 0;
        boolean flag = false;
        if (name.length() < 2) {
            System.out.println("string length is lower than expected : " + name.length());
            return;
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            char start = name.charAt(count);
            if (start == name.charAt(i)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            count++;

        }
        if (flag) {
            System.out.println("the string is palindrome");
        } else {
            System.out.println("the string is not palindrome");
        }
    }

    

    public static void main(String[] args) {
        String name = "ab";

        // System.out.println(name.charAt(0));
        // printcharacter(name);
        isPalindrome(name);

    }
}
