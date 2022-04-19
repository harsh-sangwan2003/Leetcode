class Solution {
    public int compress(char[] chars) {
        
        int j = 0;
        int count = 1;
        
        for(int i=1; i<=chars.length; i++){
            
            if(i<chars.length && chars[i]==chars[i-1])
                count++;
            
            else{
                
                chars[j++] = chars[i-1];
                
                if(count>1){
                    
                    String temp = Integer.toString(count);
                
                    for(char ch : temp.toCharArray())
                       chars[j++] = ch;
                }
                
                count = 1;
            }
        }
        
        return j;
    }
}