class StockSpanner {
    
    ArrayList<Integer> data;
    public StockSpanner() {
        
        data = new ArrayList<>();
    }
    
    public int next(int price) {
        
        int idx = data.size()-1;
        int count = 1;
        
        while(idx>=0){
            
            if(data.get(idx)>price)
                break;
            
            else
                count++;
            
            idx--;
        }
        
        data.add(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */