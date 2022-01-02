class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            
            if(i==0)
                nums[i] = nums[i];
            
            else
                nums[i] += nums[i-1];
        }
        
        return nums;
    }
}