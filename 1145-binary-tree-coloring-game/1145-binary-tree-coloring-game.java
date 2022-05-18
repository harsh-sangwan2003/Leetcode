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
    
    int countXLeft;
    int countXRight;

    public int size(TreeNode root, int x) {

        if (root == null)
            return 0;

        int lc = size(root.left, x);
        int rc = size(root.right, x);

        if (root.val == x) {

            countXLeft = lc;
            countXRight = rc;
        }

        return lc + rc + 1;
    }

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        size(root,x);
        
        int parentCount = n - (countXLeft + countXRight + 1);
        int max = Math.max(parentCount, Math.max(countXLeft, countXRight));

        int restCount = n - max;

        if (max > n/2)
            return true;

        return false;
    }
}