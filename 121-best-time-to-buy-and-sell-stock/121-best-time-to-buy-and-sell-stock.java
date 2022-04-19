class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int maxp = 0;
        
        for(int i=1; i<prices.length; i++){
            
            int currp = prices[i] - min;
            
            if(maxp<currp){
                
                maxp = currp;
            }
            
            min = Math.min(min,prices[i]);
        }
        
        return maxp;
    }
}