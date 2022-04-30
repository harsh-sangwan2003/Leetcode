class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int max_p = 0;
        
        for(int i=0; i<prices.length; i++){
            
            min = Math.min(min,prices[i]);
            int currp = prices[i] - min;
            
            max_p = Math.max(max_p,currp);
        }
        
        return max_p;
    }
}