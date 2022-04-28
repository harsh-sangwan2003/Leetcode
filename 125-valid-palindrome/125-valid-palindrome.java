class Solution {
    public boolean isPalindrome(String s) {
        
        return helper(s,0,s.length()-1);
    }
    
    public boolean helper(String s, int lo, int hi){
        
        if(lo>=hi)
            return true;
        
        if(!Character.isLetterOrDigit(s.charAt(lo)))
            return helper(s,lo+1,hi);
        
        if(!Character.isLetterOrDigit(s.charAt(hi)))
            return helper(s,lo,hi-1);
        
         return Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi)) ? false : helper(s, lo + 1, hi - 1);
    }
}