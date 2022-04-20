class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        boolean flag = false;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            
            else if(ch==')'){
                
                flag = check(st,'(');
                
                if(!flag)
                    return false;
            }
            
            else if(ch=='}'){
                
                flag = check(st,'{');
                
                if(!flag)
                    return false;
            }
            
            else if(ch==']'){
                
                flag = check(st,'[');
                
                if(!flag)
                    return false;
            }
            
        }
        
        return st.size()==0;
    }
    
    public boolean check(Stack<Character> st, char op){
        
        if(st.size()==0 || st.peek()!=op)
            return false;
        
        st.pop();
        return true;
    }
}