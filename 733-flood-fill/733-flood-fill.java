class Solution {
    public int[][] floodFill(int[][] arr, int sr, int sc, int newColor) {
        
        int color = arr[sr][sc];
        boolean[][] visit = new boolean[arr.length][arr[0].length];
        
        helper(arr,sr,sc,newColor,color,visit);
        
        return arr;
    }
    
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public void helper(int[][] arr, int sr, int sc, int newColor, int color, boolean[][] visit){
        
        arr[sr][sc] = newColor;
        visit[sr][sc] = true;
        
        System.out.print(sr + ", " + sc);
        
        for(int i=0; i<dir.length; i++){
            
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            
            if(r>=0 && c>=0 && r<arr.length && c<arr[0].length && arr[r][c]==color && !visit[r][c])
            helper(arr,r,c,newColor,color,visit);
        }
        
    }
}