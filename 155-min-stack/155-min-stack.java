class MinStack {
    
    private Stack<Integer> st;
    private Stack<Integer> ms;
    public MinStack() {
        
        st = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);
        
        if(ms.size()==0 || val<=ms.peek())
            ms.push(val);
        
    }
    
    public void pop() {
        
        int temp = st.pop();
        
        if(ms.size()!=0 && ms.peek()==temp)
            ms.pop();
    }
    
    public int top() {
        
        return st.peek();
    }
    
    public int getMin() {
     
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */