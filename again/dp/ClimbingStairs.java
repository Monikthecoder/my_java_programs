/**
 *                              * only recursion approach
 * Climbing Stairs
Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
n = 5
 *  
 */

class ClimbingStairs {

    public static int waystoClimbaStair(int n) {

        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return waystoClimbaStair(n-1) + waystoClimbaStair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(waystoClimbaStair(4));
    }
}