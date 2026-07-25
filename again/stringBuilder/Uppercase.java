class Uppercase {
    public static void uppercase(String name) {
        StringBuilder uppercase = new StringBuilder("");
        
        for(int i=0; i < name.length();i++) {
            if(uppercase.charAt(i) >= 97) {
                char ch = name.charAt(i);
                uppercase.append(name.charAt(ch - 32));
            }
        }

        for (int i = 0; i < uppercase.length(); i++) {
            System.out.println(uppercase.charAt(i));
        }
    }

    public static String toUpbyapnacollege(String name) {

        //  in apna college video she has covered the code but we have not wrote the code fully so this code is not written full
        StringBuilder string = new StringBuilder("");

        char ch = Character.toUpperCase(name.charAt(0));

        string.append(ch);

        for(int i = 1 ; i < name.length(); i++) {
            ch = Character.toUpperCase(name.charAt(i));
            string.append(name.charAt(ch));
        }

        return string.toString();
    }
    public static void main(String[] args) {
        String name = "monik";
        uppercase(name);
    }
}