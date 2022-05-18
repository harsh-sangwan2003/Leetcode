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
    
    public int countNodes(TreeNode root){
        
        if(root==null)
            return 0;
        
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        
        return lc+rc+1;
    }
    
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        if(root==null)
            return false;
        
        if(root.val==x){
            
            int op1 = countNodes(root.left);
            int op2 = countNodes(root.right);
            int op3 = n-op1-op2-1;
            
            int max = Math.max(op1,Math.max(op2,op3));
            
            if(max>n/2) 
                return true;
            
            return false;
        }
        
        boolean left = btreeGameWinningMove(root.left,n,x);
        boolean right = btreeGameWinningMove(root.right,n,x);
        
        return left||right;
    }
}