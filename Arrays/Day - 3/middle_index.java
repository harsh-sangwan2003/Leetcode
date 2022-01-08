class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int sum = 0;
        
        int leftSum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            sum += nums[i];
        }
        
        if(sum-nums[0]==0)
            return 0;
        
        for(int i=1; i<nums.length; i++){
            
            leftSum += nums[i-1];
            
            if(leftSum==sum-leftSum-nums[i])
                return i;
        }
        
        return -1;
    }
}