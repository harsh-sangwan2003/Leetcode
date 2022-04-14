class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> st = new Stack<>();
        
        for(String s : ops){
            
            if(s.equals("+")){
                
                int temp = st.pop();
                int val = temp+st.peek();
                st.push(temp);
                st.push(val);
            }
            
            else if(s.equals("D"))
                st.push(2*st.peek());
            
            else if(s.equals("C"))
                st.pop();
            
            else
                st.push(Integer.valueOf(s));
        }
        
        int ans = 0;
        
        while(st.size()!=0)
            ans+=st.pop();
        
        return ans;
    }
}