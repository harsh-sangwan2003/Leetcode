class Solution {
    public List<String> letterCasePermutation(String s) {
        
        if(s.length()==0){
            
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = s.charAt(0);
        List<String> mres = new ArrayList<>();
        
        if(Character.isDigit(ch)){
            
            List<String> rres = letterCasePermutation(s.substring(1));
            
            for(String str : rres){
                
                mres.add(ch+str);
            }
        }
        
        else{
            
            List<String> rres = letterCasePermutation(s.substring(1));
            
            for(String s1 : rres){
                
                mres.add(ch+s1);
            }
            
            if(ch>='a' && ch<='z'){
                
                ch = (char)(ch-32);
                for(String str : rres){
                    
                    mres.add(ch+str);
                }
            }
            
            else if(ch>='A' && ch<='Z'){
                
                ch = (char)(ch+32);
                
                for(String str : rres){
                    
                    mres.add(ch+str);
                }
            }
            
        }
        
        return mres;
    }
}