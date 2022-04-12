class Solution {
    public int maxProfit(int[] arr) {
        
        int min = arr[0];
        int max_p = 0;
        
        for(int i=1; i<arr.length; i++){
            
            int curr_p = arr[i] - min;
            max_p = Math.max(max_p,curr_p);
            
            min = Math.min(min,arr[i]);
        }
        
        return max_p;
    }
}