class Solution {
    public int[][] floodFill(int[][] arr, int sr, int sc, int newColor) {
        
        int color = arr[sr][sc];
        boolean[][] visit = new boolean[arr.length][arr[0].length];
        helper(arr,sr,sc,color,newColor,visit);
        return arr;
    }
    
    public void helper(int[][] arr, int sr, int sc, int color, int newColor, boolean[][] visit){
        
        if(sr<0 || sc<0 || sr>=arr.length || sc>=arr[0].length || arr[sr][sc]!=color || visit[sr][sc])
            return;
        
        visit[sr][sc] = true;
        arr[sr][sc] = newColor;
        
        helper(arr,sr-1,sc,color,newColor,visit);
        helper(arr,sr,sc-1,color,newColor,visit);
        helper(arr,sr+1,sc,color,newColor,visit);
        helper(arr,sr,sc+1,color,newColor,visit);
        
        visit[sr][sc] = false;
    }
}