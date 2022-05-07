class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        helper(nums,0,1);
        return nums;
    }
    
    public int helper(int[] nums, int idx, int productBefore){
        
        if(idx>=nums.length)
            return 1;
        
        int productAfter = helper(nums,idx+1,productBefore*nums[idx]);
        int self = nums[idx];
        
        nums[idx] = productAfter*productBefore;
        
        return productAfter*self;
    }
}