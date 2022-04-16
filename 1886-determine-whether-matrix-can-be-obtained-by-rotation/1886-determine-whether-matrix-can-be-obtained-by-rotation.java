class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(check(mat,target))
            return true;
        
        rotate(mat);
        
        if(check(mat,target))
            return true;
        
        rotate(mat);
        
        if(check(mat,target))
            return true;
        
        rotate(mat);
        
        if(check(mat,target))
            return true;
        
        return false;
    }
    
    public boolean check(int[][] arr1, int[][] arr2){
        
        for(int i=0; i<arr1.length; i++){
            
            for(int j=0; j<arr1.length; j++){
                
                if(arr1[i][j]!=arr2[i][j])
                    return false;
            }
        }
        
        return true;
    }
    
    public void rotate(int[][] arr){
        
        transpose(arr);
        
        for(int[] oned : arr)
            reverse(oned);
    }
    
    public void transpose(int[][] arr){
        
        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length; j++){
                
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
    }
    
    public void reverse(int[] arr){
        
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            
            int tmp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = tmp;
            
            lo++;
            hi--;
        }
    }
}