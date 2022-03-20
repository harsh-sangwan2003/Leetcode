class Solution {
    public int fib(int n) {

        int[] dp = new int[n + 1];
        return helper(n, dp);
    }

    public int helper(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = n;

        if (dp[n] != 0)
            return dp[n];

        int n_1 = helper(n - 1, dp);
        int n_2 = helper(n - 2, dp);

        return dp[n] = n_1 + n_2;
    }
}