class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        
        int[] dp = new int[n+1];
        
        helper(cost,0,n,dp);
        
        return Math.min(dp[0],dp[1]);
    }
    
    public int helper(int[] cost, int src, int dest, int[] dp){
        
        if(src==dest)
            return dp[src] = 0;
        
        if(src>dest)
            return 0;
        
        if(dp[src]!=0)
            return dp[src];
        
        return dp[src] = cost[src] + Math.min(helper(cost,src+1,dest,dp),helper(cost,src+2,dest,dp));
        
    }
}