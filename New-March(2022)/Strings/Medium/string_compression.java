class Solution {
    public int compress(char[] chars) {
        

        int count = 1;
        int idx = 0;
        
        for(int i=1; i<=chars.length; i++){
            
            if(i<chars.length && chars[i]==chars[i-1])
                count++;
            
            else{
                
                chars[idx++] = chars[i-1];
                
                if(count>1)
                {
                    String s = count + "";
                    for(char c : s.toCharArray()){
                        
                        chars[idx++] = c;
                    }
                }
                
                count = 1;
            }
        }
    
        return idx;
    }
}