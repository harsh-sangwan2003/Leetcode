class Solution {
    
    public int firstIdx(int[] nums, int target){
        
        int lo = 0;
        int hi = nums.length-1;
        int pans = -1;
        
        while(lo<=hi){
            
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]==target){
                
                pans = mid;
                hi = mid-1;
            }
            
            else if(nums[mid]>target)
                hi = mid-1;
            
            else
                lo = mid+1;
        }
        
        return pans;
    }
    
    public int lastIdx(int[] nums, int target){
        
        int lo = 0;
        int hi = nums.length-1;
        int pans = -1;
        
        while(lo<=hi){
            
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]==target){
                
                pans = mid;
                lo = mid+1;
            }
            
            else if(nums[mid]>target)
                hi = mid-1;
            
            else
                lo = mid+1;
        }
        
        return pans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        int fi = firstIdx(nums,target);
        int li = lastIdx(nums,target);
        
        return new int[]{fi,li};
    }
}