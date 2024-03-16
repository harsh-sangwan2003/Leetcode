class sol {

    public int maxSubArray(int[] nums) {

        int ans = Integer.MIN_VALUE, currsum = 0;

        for (int val : nums) {

            currsum += val;
            ans = Math.max(ans, currsum);

            if (currsum < 0)
                currsum = 0;
        }

        return ans;
    }
}