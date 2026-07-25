/**
 *                          * Unbounded knapsack problem // coin change
 * 
 * coins[] = {1,2,3};
 * sum = 10
 *   this is real hell 
 * 
 */

class CoinChange {
    public static int CoinChange(int[] coins , int sum) {
        int n = coins.length;
        int[][] dp = new int[n+1][sum + 1];

       // coins = i , sum = j

       for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
       }

        for(int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0;
        }

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < sum +1;j++) {
                // valid condition (Include + Exclude)
                if(coins[i-1] <= j) {
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                } else {
                    // invlaid cpndition (Exclude)
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        for(int i = 0 ; i < n + 1; i++) {
            for(int j = 0; j < sum +1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        
        return dp[n][sum];

    }
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4; // ans = 4

        System.out.println(CoinChange(coins, sum));
    }
}