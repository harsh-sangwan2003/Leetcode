class Solution {
    public int climbStairs(int n) {

        return climbStairs(n, new int[n + 1]);
    }

    public int climbStairs(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n <= 1) {
                dp[n] = 1;
                continue;
            }

            int ans = dp[n - 1] + dp[n - 2];

            dp[n] = ans;
        }

        return dp[N];
    }
}