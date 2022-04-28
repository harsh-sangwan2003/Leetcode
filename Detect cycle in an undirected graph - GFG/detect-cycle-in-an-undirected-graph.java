// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int vtces = adj.size();
        boolean[] visit = new boolean[vtces];
        
        for(int v=0; v<vtces; v++){
            
            if(!visit[v]){
                
                boolean flag = bfs(adj,v,visit);
                
                if(flag)
                return true;
            }
        }
        
        return false;
    }
    
    public boolean bfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visit){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        
        while(q.size()!=0){
            
            int sz = q.size();
            
            while(sz-->0){
                
                int rm = q.remove();
                
                if(visit[rm])
                return true;
                
                visit[rm] = true;
                
                for(int val : graph.get(rm)){
                    
                    if(!visit[val])
                    q.add(val);
                }
            }
        }
        
        return false;
    }
}