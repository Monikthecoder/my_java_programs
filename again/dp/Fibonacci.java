class Fibonacci {

    public static int fibonacci(int n , int[] dp) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        return fibonacci(n - 1 , dp) + fibonacci(n - 2,dp);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];

        fibonacci(n, dp);
    }
}