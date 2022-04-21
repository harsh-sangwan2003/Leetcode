class Solution {
    
    public class Pair{
        
        int vtx;
        int clr;
        
        Pair(){
            
        }
        
        Pair(int vtx, int clr){
            
            this.vtx = vtx;
            this.clr = clr;
        }
        
    }
    
    public boolean isBipartite(int[][] graph) {
        
        int vtces = graph.length;
        int[] visit = new int[vtces];
        Arrays.fill(visit,-1);
        
        for(int v=0; v<vtces; v++){
            
            if(visit[v]==-1){
                
                boolean flag = check(graph,v,visit);
                
                if(!flag)
                    return false;
            }
        }
        
        return true;
    }
    
    public boolean check(int[][] graph, int v, int[] visit){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(v,0));
        
        while(q.size()!=0){
            
            int size = q.size();
            
            Pair top = q.remove();
                
                if(visit[top.vtx]==-1){
                    
                    visit[top.vtx] = top.clr;
                }
                
                else{
                    
                    if(visit[top.vtx]==top.clr)
                        continue;
                    
                    else
                        return false;
                }
                
                int src = top.vtx;
                
                for(int e : graph[src]){
                    
                    if(visit[e]==-1){
                        
                        q.add(new Pair(e,1-top.clr));
                    }
                }
        }
        
        return true;
    }
}