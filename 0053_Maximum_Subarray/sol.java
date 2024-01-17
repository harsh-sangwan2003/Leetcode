class Solution {
    public int maxSubArray(int[] nums) {

        int maxsum = Integer.MIN_VALUE, currsum = 0;

        for (int val : nums) {

            currsum += val;
            maxsum = Math.max(currsum, maxsum);

            if (currsum < 0)
                currsum = 0;
        }

        return maxsum;
    }
}