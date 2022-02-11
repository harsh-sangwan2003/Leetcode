class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < nums.length; i++) {

            currsum += nums[i];

            maxSum = Math.max(currsum, maxSum);

            if (currsum < 0)
                currsum = 0;
        }

        return maxSum;
    }
}