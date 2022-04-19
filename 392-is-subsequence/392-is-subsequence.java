class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j = -1;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            j = getIdx(t,ch,j+1);
            
            if(j==-1) return false;
        }
        
        return true;
    }
    
    public int getIdx(String s, char ch, int st){
        
        for(int i=st; i<s.length(); i++)
            if(s.charAt(i)==ch) return i;
        
        return -1;
    }
}