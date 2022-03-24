class Solution {
    public boolean checkPowersOfThree(int n) {
        
        return helper(1,n);
    }
    
    public boolean helper(int x, int n){
        
        if(x>n || n<0) return false;
        
        if(x==n || n==0) return true;
        
        boolean op1 = helper(x*3,n-x);
        boolean op2 = helper(x*3,n);
        
        return (op1||op2);
    }
}