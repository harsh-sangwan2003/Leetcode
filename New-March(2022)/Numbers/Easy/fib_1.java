// Time - O(2^n)
// Space - O(n)

class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;
        
        int n_1 = fib(n-1);
        int n_2 = fib(n-2);
        
        return n_1 + n_2;
    }
}