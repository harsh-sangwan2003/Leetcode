class Solution {
    public boolean isSubsequence(String s, String t) {
        
        for(int i=0,j=-1; i<s.length(); i++){
            
            j = t.indexOf(s.charAt(i),j+1);
            
            if(j==-1) return false;
        }
        
        return true;
    }
}