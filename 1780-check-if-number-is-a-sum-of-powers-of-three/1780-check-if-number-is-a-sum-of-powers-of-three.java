class Solution {
    public boolean checkPowersOfThree(int n) {
        
        return helper(n,1);
    }
    
    public boolean helper(int n, int x){
        
        if(x>n || n<0) return false;
        
        if(x==n || n==0) return true;
        
        boolean op1 = helper(n-x,x*3);
        boolean op2 = helper(n,x*3);
        
        return (op1||op2);
    }
}