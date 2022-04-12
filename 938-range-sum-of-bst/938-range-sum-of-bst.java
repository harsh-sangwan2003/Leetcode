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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        sum = 0;
        
        helper(root,low,high);
        
        return sum;
    }
    
    public void helper(TreeNode root, int lo, int hi){
        
        if(root==null) return;
        
        if(root.val>=hi){
            
            if(root.val==hi){
                
                sum += root.val;
                helper(root.left,lo,hi);
            }
            
            else
                helper(root.left,lo,hi);
        }
        
        else if(root.val<=lo){
            
            if(root.val==lo){
                
                sum += root.val;
                helper(root.right,lo,hi);
            }
            
            else
                helper(root.right,lo,hi);
            
        }
        
        else{
            
            sum += root.val;
            helper(root.left,lo,hi);
            helper(root.right,lo,hi);
        }
    }
}