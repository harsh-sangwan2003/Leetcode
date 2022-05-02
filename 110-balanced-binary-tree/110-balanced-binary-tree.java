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
    
    public class Pair{
        
        int ht;
        boolean flag;
        
        Pair(){
            
        }
        
        Pair(int ht, boolean flag){
            
            this.ht = ht;
            this.flag = flag;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        
        Pair ans = helper(root);
        return ans.flag;
    }
    
    public Pair helper(TreeNode root){
        
        if(root==null)
            return new Pair(-1,true);
        
        Pair lp = helper(root.left);
        Pair rp = helper(root.right);
        
        Pair mp = new Pair();
        mp.ht = Math.max(lp.ht,rp.ht) + 1;
        mp.flag = lp.flag && rp.flag && (Math.abs(lp.ht-rp.ht)<=1);
        
        return mp;
    }
}