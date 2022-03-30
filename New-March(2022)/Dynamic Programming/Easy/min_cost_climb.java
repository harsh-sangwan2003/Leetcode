class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length + 1];

        return mcs(cost.length, cost, dp);
    }

    public int mcs(int n, int[] cost, int[] dp) {

        if (n <= 1)
            return cost[n];

        if (dp[n] != 0)
            return dp[n];

        int res1 = mcs(n - 1, cost, dp);
        int res2 = mcs(n - 2, cost, dp);

        int res = n == cost.length ? 0 : cost[n];
        return dp[n] = res + Math.min(res1, res2);
    }
}