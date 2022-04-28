class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        
        int count = 0;
        int max_area = 0;
        
        for(int i=0; i<grid.length; i++){
            
            for(int j=0; j<grid[0].length; j++){
                
                if(grid[i][j]==1)
                {
                    int area = dfs(grid,i,j);
                    max_area = Math.max(max_area,area);
                }
            }
        }
        
        return max_area;
    }
    
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public int dfs(int[][] grid, int sr, int sc){
        
        grid[sr][sc] = 0;
        int count = 1;
        
        for(int i=0; i<dir.length; i++){
            
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1)
            count += dfs(grid,r,c);
        }
        
        return count;
    }
}