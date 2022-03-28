class Solution {
    public int mySqrt(int x) {
        
        if(x==0) return 0;
        
        if(x==1 || x==2 || x==3) return 1;
        
        int lo = 2;
        int hi = x;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo)/2;
            
            if(mid==x/mid)
                return mid;
            
            else if(mid<=x/mid)
                lo = mid+1;
            
            else
                hi = mid-1;
        }
        
        return lo-1;
    }
}