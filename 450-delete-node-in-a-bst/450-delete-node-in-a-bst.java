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
    
    public int findMax(TreeNode node){
        
        if(node==null)
            return Integer.MIN_VALUE;
        
        int lc = findMax(node.left);
        int rc = findMax(node.right);
        
        return Math.max(node.val,Math.max(lc,rc));
        
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null) return null;
        
        else if(root.val<key){
            
            root.right = deleteNode(root.right,key);
            return root;
        }
        
        else if(root.val>key){
            
            root.left = deleteNode(root.left,key);
            return root;
        }
        
        else{
            
            if(root.left==null && root.right==null)
                return null;
            
            else if(root.left==null) 
                return root.right;
            
            else if(root.right==null)
                return root.left;
            
            else{
                
                int max = findMax(root.left);
                root.val = max;
                root.left = deleteNode(root.left,max);
                return root;
            }
        }
        
    }
}