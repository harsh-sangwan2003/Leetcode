class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        while(i<=j){
            
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            
            else{
                
                char st = s.charAt(i);
                char et = s.charAt(j);
                
                if(Character.toLowerCase(st) != Character.toLowerCase(et))
                    return false;
                
                i++;
                j--;
            }
        }
        
        return true;
    }
}