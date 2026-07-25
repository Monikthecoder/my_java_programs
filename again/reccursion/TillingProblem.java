/**
 *                  *            AMAZON
 * * Problem 11

** Tiling Problem
** Given a "2 x n" board and tiles of size "2 x 1", count the number of
** ways to tile the given board using the 2 x 1 tiles.
** (A tile can either be placed horizontally or vertically. )
 */

class TillingProblem {

    public static int Totalways(int n) { // 2 x n (i know the vertical length that is 2 but the horizontal length is n so we pick n as the parameter here)
        if(n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = Totalways(n-1);

        // horizontal choice
        int fnm2 = Totalways(n-2);

        int totalways = fnm1 + fnm2;


        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(Totalways(3));
    }
}