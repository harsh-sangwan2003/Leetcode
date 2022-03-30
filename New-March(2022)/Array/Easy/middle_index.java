class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int sum = 0;
        
        for(int val : nums)
            sum += val;
        
        int lsum = 0;
        int rsum = 0;
        
        if(sum-nums[0]==0) return 0;
        
        for(int i=0; i<nums.length; i++){
            
            lsum += i==0?0:nums[i-1];
            rsum = sum - nums[i] - lsum;
            
            if(lsum==rsum)
                return i;
        }
        
        return -1;
    }
}