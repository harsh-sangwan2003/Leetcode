// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static long mod = (long)(1e9+7);
    long countStrings(int n) {
        // code here
        long old0 = 1;
        long old1 = 1;
        
        for(int i=2; i<=n; i++){
            
            long new0 = (old0+old1)%mod;
            long new1 = old0;
            
            old0 = new0;
            old1 = new1;
        }
        
        return (old0+old1)%mod;
    }
}