class Solution {
    
    public class Pair{
        
        int x;
        int y;
        
        Pair(int x, int y){
            
            this.x = x;
            this.y = y;
        }
    }
    
    
    public int init(Queue<Pair> q, int[][] grid){
        
        int fresh = 0;
        
        for(int i=0; i<grid.length; i++){
            
            for(int j=0; j<grid[0].length; j++){
                
                if(grid[i][j]==2)
                    q.add(new Pair(i,j));
                
                else if(grid[i][j]==1)
                    fresh++;
            }
        }
        
        return fresh;
    }
    
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair> q = new LinkedList<>();
        int fresh = init(q,grid);
        
        if(fresh==0)
        return 0;
        
        int time = 0;
        while(q.size()!=0){
            
            int sz = q.size();
            
            while(sz-->0){
                
                Pair rm = q.remove();
                int i = rm.x;
                int j = rm.y;
                
                if(grid[i][j]==1){
                    
                    grid[i][j] = 2;
                    fresh--;
                }
                
                if(fresh==0)
                    return time;
                
                for(int x=0; x<dir.length; x++){
                    
                    int nr = i + dir[x][0];
                    int nc = j + dir[x][1];
                    
                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1)
                        q.add(new Pair(nr,nc));
                }
            }
            
            time++;
        }
        
        return fresh==0?time:-1;
    }
}