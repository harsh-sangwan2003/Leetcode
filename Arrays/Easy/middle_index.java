class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int sum = 0;
        int lsum = 0;
        int rsum = 0;
        
        for(int i=0; i<nums.length; i++)
            sum+=nums[i];
        
        int currsum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            currsum += nums[i];
            lsum = currsum - nums[i];
            rsum = sum - currsum;
            
            if(lsum==rsum)
                return i;
        }
        
        return -1;
    }
}