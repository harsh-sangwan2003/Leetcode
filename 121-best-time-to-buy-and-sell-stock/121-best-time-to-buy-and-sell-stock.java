class Solution {
    public int maxProfit(int[] prices) {
        
        int maxp = 0;
        int min = prices[0];
        
        for(int i=1; i<prices.length; i++){
            
            int currp = prices[i] - min;
            min = Math.min(min,prices[i]);
            
            maxp = Math.max(maxp,currp);
        }
        
        return maxp;
    }
}