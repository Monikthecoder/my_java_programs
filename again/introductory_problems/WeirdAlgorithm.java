class WeirdAlgorithm {
    public static void main(String[] args) {
        int n = 3;

        while( n != 1) {
            if(n % 2 == 0) {
                n = n /2;
                System.out.println("n is :" + n);
            } else {
                n = (n * 3) + 1; 
                System.out.println("n is :" + n);
            }
        }
    }
}