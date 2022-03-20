// Time - O(n)
// Space - O(n)

class Solution {
    public int fib(int n) {

        return helper(n, new int[n + 1]);
    }

    public int helper(int N, int[] dp) {

        for (int n = 0; n <= N; n++) {

            if (n <= 1) {

                dp[n] = n;
                continue;
            }

            int n_1 = dp[n - 1];
            int n_2 = dp[n - 2];

            dp[n] = n_1 + n_2;
        }

        return dp[N];
    }
}