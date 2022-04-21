class Solution {
    public int search(int[] nums, int target) {
        
        int lo = 0;
        int hi = nums.length-1;
        
        return find(nums,target,lo,hi);
    }
    
    public int find(int[] nums, int target, int lo, int hi){
        
        if(lo>hi) return -1;
        
        else if(lo==hi){
            
            if(nums[lo]==target) return lo;
            
            return -1;
        }
        
        int mid = lo + (hi-lo)/2;
        
        if(nums[mid]==target){
            
            return mid;
        }
        
        else if(nums[mid]>target){
            
            int left = find(nums,target,lo,mid-1);
            
            if(left!=-1) return left;
        }
        
        else{
            
            int right = find(nums,target,mid+1,hi);
            
            if(right!=-1) return right;
        }
        
        return -1;
    }
}