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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        
        q.add(root);
        
        while(q.size()!=0){
            
            int sz = q.size();
            List<Integer> curr = new ArrayList<>();
            
            while(sz-->0){
                
                TreeNode node = q.remove();
                curr.add(node.val);
                
                if(node.left!=null)
                    q.add(node.left);
                
                if(node.right!=null)
                    q.add(node.right);
            }
            
            res.add(curr);
        }
        
        return res;
    }
}