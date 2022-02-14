class Solution {
    
    public int firstIndex(int[] nums, int target){
        
        int ans = -1;
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]==target){
                
                ans = mid;
                hi = mid-1;
            }
            
            else if(nums[mid]>target)
                hi = mid-1;
            
            else
                lo = mid+1;
        }
        
        return ans;
    }
    
    public int lastIndex(int[] nums, int target){
        
        int ans = -1;
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo+(hi-lo)/2;
            
            if(nums[mid]==target){
                
                ans = mid;
                lo = mid+1;
            }
            
            else if(nums[mid]>target)
                hi = mid-1;
            
            else
                lo = mid+1;
        }
        
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        int fi = firstIndex(nums,target);
        int li = lastIndex(nums,target);
        
        ans[0] = fi;
        ans[1] = li;
        
        return ans;
    }
}