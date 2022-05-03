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
        
        List<List<Integer>> res = new ArrayList<>();
        
        solve(root,res,0);
        
        return res;
    }
    
    public void solve(TreeNode root, List<List<Integer>> res, int lvl){
        
        if(root==null)
            return;
        
        if(lvl==res.size())
            res.add(new ArrayList<>());
        
        res.get(lvl).add(root.val);
        
        solve(root.left,res,lvl+1);
        solve(root.right,res,lvl+1);
    }
}