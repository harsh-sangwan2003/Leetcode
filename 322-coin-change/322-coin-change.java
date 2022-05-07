class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        
        for(int i=1; i<dp.length; i++){
            
            int min = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){
                
                if(i-coins[j]>=0 && dp[i-coins[j]]!=-1)
                    min = Math.min(min,dp[i-coins[j]]);
            }
            
            if(min!=Integer.MAX_VALUE)
            dp[i] = 1+min;
            
            else
                dp[i] = -1;
        }
        
        return dp[amount];
    }
}