class sol {

    public int maxProfit(int[] prices) {

        int ans = 0, min = prices[0];

        for (int i = 1; i < prices.length; i++) {

            min = Math.min(min, prices[i]);
            int currp = prices[i] - min;

            ans = Math.max(ans, currp);
        }

        return ans;
    }
}