/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public class Pair implements Comparable<Pair>{
        
        TreeNode node;
        int hl;
        int vl;
        
        Pair(TreeNode node, int hl, int vl){
            
            this.node = node;
            this.hl = hl;
            this.vl = vl;
        }
        
        public int compareTo(Pair o){
            
            if(this.hl==o.hl)
                return this.node.val - o.node.val;
            
            else
                return this.hl - o.hl;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0,0));
        
        int sv = 0;
        int lv = 0;
        
        HashMap<Integer,PriorityQueue<Pair>> map = new HashMap<>();
        
        while(q.size()!=0){
            
            int sz = q.size();
            
            while(sz-->0){
                
                Pair rm = q.remove();
                
                if(rm.vl<sv)
                    sv = rm.vl;
                
                if(rm.vl>lv)
                    lv = rm.vl;
                
                if(!map.containsKey(rm.vl))
                    map.put(rm.vl,new PriorityQueue<>());
                
                map.get(rm.vl).add(rm);
                
                if(rm.node.left!=null)
                    q.add(new Pair(rm.node.left,rm.hl+1,rm.vl-1));
                
                if(rm.node.right!=null)
                    q.add(new Pair(rm.node.right,rm.hl+1,rm.vl+1));
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=sv; i<=lv; i++){
            
            List<Integer> list = new ArrayList<>();
            PriorityQueue<Pair> pq = map.get(i);
            
            while(pq.size()!=0){
                
                Pair temp = pq.remove();
                list.add(temp.node.val);
            }
            
            res.add(list);
        }
        
        return res;
    }
}