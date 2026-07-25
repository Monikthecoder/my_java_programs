/**
 * 
 *  * THIS IS OPTIMIZED WAY OF SOLVING PROBLEMS 
 * 
 */
class Power {
    public static int power(int number , int n) {

        if(n == 0) {
            return 1;
        }

        int halfsqr = power(number, n/2) * power(number, n/2);

        if(n % 2 != 0) {
            halfsqr = number * halfsqr;
        }

        return halfsqr;
    }
    public static void main(String[] args) {

        int number = 2;
        int n = 10;
        System.err.println("2 to the power 10 is : " + power(number, n));

    }
}