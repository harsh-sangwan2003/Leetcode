class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        
        if(n<=1)
            return true;
        
        int i=0;
        int j = n-1;
        
        while(i<j){
            
            char first = s.charAt(i);
            char last = s.charAt(j);
            
            if(!Character.isLetterOrDigit(first))
                i++;
            
            else if(!Character.isLetterOrDigit(last))
                j--;
            
            else{
                
                if(Character.toLowerCase(first)!=Character.toLowerCase(last))
                    return false;
                
                i++;
                j--;
            }
        }
        
        return true;
    }
}