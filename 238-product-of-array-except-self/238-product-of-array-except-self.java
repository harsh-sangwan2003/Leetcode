class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod = 1;
        int count = 0;
        
        for(int val : nums)
        {
            if(val==0)
                count++;
            
            else
                prod *= val;
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(count>1)
                nums[i] = 0;
            
            else{
                
                if(nums[i]==0)
                    nums[i] = prod;
                
                else if(nums[i]!=0 && count==1)
                    nums[i] = 0;
                
                else
                    nums[i] = prod/nums[i];
            }
        }
        
        return nums;
    }
}