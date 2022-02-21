class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        boolean flag = check(mat,target);
        
        if(flag)
            return true;
        
        rotate(mat);
        flag = check(mat,target);
        
        if(flag)
            return true;
        
        rotate(mat);
        flag = check(mat,target);
        
        if(flag)
            return true;
        
        rotate(mat);
        flag = check(mat,target);
        
        if(flag)
            return true;
        
        return false;
    }
    
    public void rotate(int[][] mat){
        
        for(int i=0; i<mat.length; i++){
            
            for(int j=i+1; j<mat[0].length; j++){
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(int[] oned : mat)
            reverse(oned);
    }
    
    public void reverse(int[] arr){
        
        int st = 0;
        int et = arr.length-1;
        
        while(st<=et){
            
            int temp = arr[st];
            arr[st] = arr[et];
            arr[et] = temp;
            
            st++;
            et--;
        }
        
    }
    
    public boolean check(int[][] mat, int[][] target){
        
        for(int i=0; i<mat.length; i++){
            
            for(int j=0; j<mat[0].length; j++){
                
                if(mat[i][j]!=target[i][j])
                    return false;
            }
        }
        
        return true;
    }
}