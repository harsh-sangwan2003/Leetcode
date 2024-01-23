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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null)
        return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        List<Integer> left = inorderTraversal(root.left);
        for(int val : left)
        res.add(val);

        res.add(root.val);

        List<Integer> right = inorderTraversal(root.right);
        for(int val : right)
        res.add(val);

        return res;
    }
}