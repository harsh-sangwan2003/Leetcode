class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = 0;
        int c = matrix[0].length-1;
        
        while(true){
            
            if(matrix[r][c]==target)
                return true;
            
            else if(matrix[r][c]>target)
                c--;
            
            else
                r++;
            
            if(r>=matrix.length || c<0)
                return false;
        }
        
    }
}