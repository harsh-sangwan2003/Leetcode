class Solution {
    
    static String[] codes = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0) return new ArrayList<>();
        
        return helper(digits);
    }
    
    public List<String> helper(String digits){
        
        if(digits.length()==0){
            
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = digits.charAt(0);
        String ros = digits.substring(1);
        
        List<String> rres = helper(ros);
        List<String> mres = new ArrayList<>();
        
        for(int i=0; i<codes[ch-'2'].length(); i++){
            
            for(String s : rres){
                
                mres.add(codes[ch-'2'].charAt(i)+s);
            }
            
        }
        
        return mres;
    }
}