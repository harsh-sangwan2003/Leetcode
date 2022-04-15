class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;
        
        for(int val : nums){
            
            currsum += val;
            
            max_sum = Math.max(max_sum,currsum);
            
            if(currsum<0)
                currsum = 0;
        }
        
        return max_sum;
    }
}