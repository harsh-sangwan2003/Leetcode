class Solution {
    public int[][] floodFill(int[][] arr, int sr, int sc, int newColor) {
        
        int color = arr[sr][sc];
        boolean[][] visit = new boolean[arr.length][arr[0].length];
        
        helper(arr,sr,sc,color,visit,newColor);
        
        return arr;
    }
    
    public void helper(int[][] arr, int sr, int sc, int color, boolean[][] visit, int newColor){
        
        if(sr<0 || sc<0 || sr>=arr.length || sc>=arr[0].length || visit[sr][sc] || arr[sr][sc]!=color)
            return;
        
        arr[sr][sc] = newColor;
        visit[sr][sc] = true;
        
        helper(arr,sr-1,sc,color,visit,newColor);
        helper(arr,sr,sc-1,color,visit,newColor);
        helper(arr,sr+1,sc,color,visit,newColor);
        helper(arr,sr,sc+1,color,visit,newColor);
        
        
    }
}