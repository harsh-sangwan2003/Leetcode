class Solution {
    public int firstMissingPositive(int[] nums) {
        
        boolean flag = false;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1)
                flag = true;
            
            if(nums[i]<=0 || nums[i]>nums.length)
                nums[i] = 1;
        }
        
        if(!flag) return 1;
        
        for(int i=0; i<nums.length; i++){
            
            int currIdx = Math.abs(nums[i]) - 1;
            
            if(nums[currIdx]>0)
                nums[currIdx]*=-1;
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]>0) return i+1;
        }
        
        return nums.length+1;
    }
}