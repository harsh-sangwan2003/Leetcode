class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        
        for(int i=0; i<t.length(); i++){
            
            char ch = t.charAt(i);
            
            if(map.containsKey(ch)){
                
                j = s.indexOf(ch,map.get(ch));
                
                if(j==-1)
                    return false;
                
                map.put(ch,j+1);
            }
            
            else{
                
                j = s.indexOf(ch,0);
                
                if(j==-1) return false;
                
                map.put(ch,j+1);
            }
        }
        
        return true;
    }
}