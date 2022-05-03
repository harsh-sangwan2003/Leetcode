class Solution {
    public boolean canConstruct(String s1, String s2) {
        
        
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        
        for(int i=0; i<s1.length(); i++){
            
            char ch = s1.charAt(i);
            
            if(map.containsKey(ch))
                j = s2.indexOf(ch,map.get(ch)+1);
            
            else
                j = s2.indexOf(ch,0);
            
            if(j==-1)
                return false;
            
            map.put(ch,j);
        }
        
        return true;
    }
}