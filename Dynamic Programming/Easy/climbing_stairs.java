class Solution {

    public int climbStairs(int n) {

        return climbStairs(n, new int[n + 1]);
    }

    public int climbStairs(int n, int[] dp) {

        if (n <= 1)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        int ans = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);

        return dp[n] = ans;
    }
}