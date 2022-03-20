class Solution {
    public int tribonacci(int n) {

        return tb(n, new int[n + 1]);
    }

    public int tb(int n, int[] dp) {

        if (n == 0)
            return dp[n] = n;

        if (n <= 2)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        return dp[n] = tb(n - 1, dp) + tb(n - 2, dp) + tb(n - 3, dp);
    }
}