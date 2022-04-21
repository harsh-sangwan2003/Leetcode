class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;
        
        for(int val : nums){
            
            if(currsum<0)
            {
                currsum = 0;
            }
            
            currsum += val;
            max_sum = Math.max(currsum,max_sum);
        }
        
        return max_sum;
    }
}