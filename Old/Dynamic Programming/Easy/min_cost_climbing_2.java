class Solution {
    public int minCostClimbingStairs(int[] cost) {

        for (int i = 2; i < cost.length; i++) {

            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        int n = cost.length;

        return Math.min(cost[n - 1], cost[n - 2]);
    }

}