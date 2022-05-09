class Solution {
    
    public int longestPalindrome(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        boolean flag = false;
        int result = 0;
        
        for(Character ch : map.keySet()){
            
            int val = map.get(ch);
            
            if(val%2==0)
                result += val;
            
            else{
                
                flag = true;
                
                result += val-1;
            }
        }
        
        if(flag) result++;
        
        return result;
    }
}