class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        
        int res = 0;
        int temp = x;
        
        while(x!=0){
            
            int rem = x%10;
            res = res*10+rem;
            x/=10;
        }
        
        return res==temp;
    }
}