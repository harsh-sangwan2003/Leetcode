class Solution {
    
    public class Pair{
        
        int x;
        int y;
        
        Pair(int x, int y){
            
            this.x = x;
            this.y = y;
        }
    }
    
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public int[][] updateMatrix(int[][] arr) {
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr[0].length; j++){
                
                if(arr[i][j]==0)
                    q.add(new Pair(i,j));
                
                else
                    arr[i][j] = -1;
            }
        }
        
        while(q.size()!=0){
            
            int sz = q.size();
            
            while(sz-->0){
                
                Pair rm = q.remove();
                
                for(int i=0; i<dir.length; i++){
                    
                    int r = rm.x + dir[i][0];
                    int c = rm.y + dir[i][1];
                    
                    if(r>=0 && c>=0 && r<arr.length && c<arr[0].length && arr[r][c]<0)
                    {
                        q.add(new Pair(r,c));
                        arr[r][c] = arr[rm.x][rm.y] + 1;
                    }
                }
            }
        }
        
        return arr;
    }
}