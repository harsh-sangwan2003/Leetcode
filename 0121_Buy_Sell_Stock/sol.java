class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP = 0, min = prices[0];

        for(int i=1; i<prices.length; i++){

            int currP = prices[i] - min;
            maxP = Math.max(currP,maxP);
            min = Math.min(min,prices[i]);
        }

        return maxP;
    }
}