class Solution {
    public double myPow(double x, int n) {
        
        if(x==0) return 0d;
        
        if(x==1 || n==1) return x;
        
        if(n==0) return 1d;
        
        if(n<0) return 1/x * myPow(1/x,-(n+1));
        
        double temp = myPow(x,n/2);
        
        if(n%2==0) return temp*temp;
        
        else return x*temp*temp;
    }
}