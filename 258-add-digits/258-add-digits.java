class Solution {
    public int addDigits(int num) {
        
        if(num==0) return 0;
        
        int rem = num%9;
        
        if(rem==0) return 9;
        
        else return rem;
    }
}