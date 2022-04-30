class Solution {
    public int climbStairs(int n) {
         
        return helper(n,new int[n+1]);
    }
    
    public int helper(int n, int[] dp){
        
        if(n<=1)
            return dp[n] = 1;
        
        if(dp[n]!=0)
            return dp[n];
        
        int n_1 = helper(n-1,dp);
        int n_2 = helper(n-2,dp);
        
        return dp[n] = n_1 + n_2;
    }
}