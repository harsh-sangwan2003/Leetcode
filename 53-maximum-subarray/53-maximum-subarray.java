class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            currsum += nums[i];
            max_sum = Math.max(currsum,max_sum);
            
            if(currsum<0)
                currsum = 0;
            
        }
        
        return max_sum;
    }
}