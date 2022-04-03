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
    
    static int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root.left==null && root.right==null)
            return 0;
        
        sum = 0;
        
        helper(root,true);
        
        return sum;
    }
    
    public void helper(TreeNode root, boolean flag){
        
        if(root==null) return;
        
        if(flag && root.left==null && root.right==null){
            
            sum += root.val;
            return;
        }
        
        helper(root.left,true);
        helper(root.right,false);
    }
}