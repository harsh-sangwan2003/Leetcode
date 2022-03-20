class Solution {
    public int tribonacci(int n) {

        return tb(n, new int[n + 1]);
    }

    public int tb(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n <= 2) {
                dp[n] = n == 0 ? 0 : 1;
                continue;
            }

            dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
        }

        return dp[N];
    }
}