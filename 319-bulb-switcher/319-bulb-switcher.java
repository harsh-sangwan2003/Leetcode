class Solution {
    public int bulbSwitch(int n) {
        
        int count = 0;
        
        for(int x=1; x*x<=n; x++){
            
            count++;
        }
        
        return count;
    }
}