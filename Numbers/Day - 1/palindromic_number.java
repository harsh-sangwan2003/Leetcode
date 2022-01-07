class Solution {
    
    public int reverse(int num){
        
        int res = 0;
        
        while(num!=0){
            
            int rem = num%10;
            num/=10;
            
            res = res*10+rem;
        }
        
        return res;
    }
    
    public boolean isPalindrome(int x) {
        
        
        if(x<0 || x!=reverse(x))
            return false;
        
        else
            return true;
    }
}