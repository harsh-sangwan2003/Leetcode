class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
            return false;
        
        int rev = reverse(x);
        
        return rev==x;
    }
    
    public int reverse(int n){
        
        int res = 0;
        
        while(n!=0){
            
            int rem = n%10;
            n/=10;
            
            res = res*10 + rem;
        }
        
        return res;
    }
}