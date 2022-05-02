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
    
    static boolean flag;
    
    public boolean isBalanced(TreeNode root) {
        
        flag = true;
        
        helper(root);
        
        return flag;
    }
    
    public int helper(TreeNode root){
        
        if(root==null)
            return -1;
        
        int lh = helper(root.left);
        int rh = helper(root.right);
        
        int delta = Math.abs(lh-rh);
        
        if(delta>1 || !flag)
        {
            flag = false;
        }
        
        return Math.max(lh,rh) + 1;
    }
}