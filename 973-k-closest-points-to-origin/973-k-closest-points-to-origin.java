class Solution {
    
    public double distance(int x, int y){
        
        double dist = (double)(Math.sqrt(y*y + x*x));
        
        return dist;
    }
    
    public class Pair{
        
        int x;
        int y;
        double dist;
        
        Pair(){
            
        }
        
        Pair(int x, int y, double dist){
            
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->{
            
            if(a.dist>b.dist)
                return -1;
            
            else
                return 1;
        });
        
    
        for(int i=0; i<points.length; i++){
            
            double dist = distance(points[i][0],points[i][1]);
            
            if(pq.size()<k)
                pq.add(new Pair(points[i][0],points[i][1],dist));
            
            else if(dist<pq.peek().dist){
                
                pq.remove();
                pq.add(new Pair(points[i][0],points[i][1],dist));
            }
        }
        
        int[][] res = new int[pq.size()][2];
        int idx = 0;
        
        while(pq.size()!=0){
            
            Pair rm = pq.remove();
            res[idx][0] = rm.x;
            res[idx][1] = rm.y;
            idx++;
        }
        
        return res;
    }
}