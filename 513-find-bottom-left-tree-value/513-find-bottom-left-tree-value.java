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
    
    public int height(TreeNode root){
        
        if(root==null)
            return -1;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh,rh) + 1;
        
    }
    
    public int findBottomLeftValue(TreeNode root) {
        
        if(root==null)
            return -1;
        
        int maxh = height(root);
        Queue<TreeNode> q=  new LinkedList<>();
        q.add(root);
        
        int currlvl = 0;
        
        while(q.size()!=0){
            
            int sz = q.size();
            
            while(sz-->0){
                
                TreeNode node = q.remove();
                
                if(currlvl==maxh)
                    return node.val;
                
                if(node.left!=null)
                    q.add(node.left);
                
                if(node.right!=null)
                    q.add(node.right);
                
            }
            
            currlvl++;
        }
        
        return -1;
    }
}