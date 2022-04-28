class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            
            char st = s.charAt(i);
            char et = s.charAt(j);
            
            if(!Character.isLetterOrDigit(st))
                i++;
            
            else if(!Character.isLetterOrDigit(et))
                j--;
            
            else{
                
                if(Character.toLowerCase(st)!=Character.toLowerCase(et))
                    return false;
                
                i++;
                j--;
            }
        }
        
        return true;
    }
}