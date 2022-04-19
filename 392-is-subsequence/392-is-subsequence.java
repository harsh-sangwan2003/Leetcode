class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j = -1;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            j = t.indexOf(ch,j+1);
            
            if(j==-1) return false;
        }
        
        return true;
    }
}