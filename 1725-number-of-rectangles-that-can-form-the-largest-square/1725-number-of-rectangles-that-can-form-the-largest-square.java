class Solution {
    public int countGoodRectangles(int[][] arr) {
        
        int maxLen = -1;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            
            int currLen = Math.min(arr[i][0],arr[i][1]);
            
            maxLen = Math.max(currLen,maxLen);
        }
        
        for(int i=0; i<arr.length; i++){
            
            if(Math.min(arr[i][0],arr[i][1])>=maxLen)
                count++;
        }
        
        return count;
    }
}