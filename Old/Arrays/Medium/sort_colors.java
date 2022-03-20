class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        
        while(j<=k){
            
            if(nums[j]==1)
                j++;
            
            else if(nums[j]==0){
                
                swap(nums,i,j);
                i++;
                j++;
            }
            
            else{
                
                swap(nums,j,k);
                k--;
            }
            
        }
    }
    
    public void swap(int[] arr, int i, int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}