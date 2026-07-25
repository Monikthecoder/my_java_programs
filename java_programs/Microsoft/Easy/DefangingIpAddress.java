class DefangingIpAddress {

    /*
    
Defanging an IP Address
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Input : address = "1.1.1.1"
Output : "1[.]1[.]1[.]1"
    
    */
    public static void main(String[] args) {
        String ipAddress = "1.1.1.1";
        StringBuilder str = new StringBuilder();

        for(int i=0;i<ipAddress.length();i++) {

                if(ipAddress.charAt(i) == '.') {
                    str.append("[.]");
                }
                else {
                    str.append(ipAddress.charAt(i));
                }
        }
        System.out.println(str);
    }
}