class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        if(s.length()!=t.length()) return false;
        
        int j = -1;
        
        for(int i=0; i<t.length(); i++){
            
            char ch = t.charAt(i);
            
            if(map.containsKey(ch))
                j = s.indexOf(ch,map.get(ch)+1);
            
            else
                j = s.indexOf(ch,0);
            
            
            if(j==-1) return false;
            
            map.put(ch,j);
        }
        
        return true;
    }
}