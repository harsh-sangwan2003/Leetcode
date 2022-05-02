class MyQueue {
    
    Stack<Integer> ms;
    Stack<Integer> helper;
    
    public MyQueue() {
        
        ms = new Stack<>();
        helper = new Stack<>();
        
    }
    
    public void push(int x) {
        
        while(ms.size()!=0)
            helper.add(ms.pop());
        
        ms.add(x);
        
        while(helper.size()!=0)
            ms.add(helper.pop());
        
    }
    
    public int pop() {
        
        return ms.pop();
    }
    
    public int peek() {
        
        return ms.peek();
    }
    
    public boolean empty() {
        
        return ms.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */