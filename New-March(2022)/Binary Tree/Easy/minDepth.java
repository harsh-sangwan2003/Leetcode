
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    static int depth;

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        depth = Integer.MAX_VALUE;

        helper(root, 1);

        return depth;
    }

    public void helper(TreeNode root, int lvl) {

        if (root == null)
            return;

        if (root.left == null && root.right == null) {

            depth = Math.min(depth, lvl);
            return;
        }

        helper(root.left, lvl + 1);
        helper(root.right, lvl + 1);

    }
}