class Solution {
    
    public boolean inRange(int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        return true;
    }
    
    public int mazePath_01(int sr, int sc, int dr, int dc, int[][] dir, int[][] dp) {

        if (sr == dr && sc == dc) {

            return dp[sr][sc] = 1;
        }
        
        if(dp[sr][sc]!=0)
            return dp[sr][sc];
        
        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (inRange(r, c, dr + 1, dc + 1)) {

                count += mazePath_01(r, c, dr, dc, dir, dp);
            }
        }

        return dp[sr][sc] = count;
    }
    
    public int uniquePaths(int m, int n) {
        
        int[][] dir = { { 0, 1 }, { 1, 0 } };
        return mazePath_01(0,0,m-1,n-1,dir,new int[m][n]);
    }
}