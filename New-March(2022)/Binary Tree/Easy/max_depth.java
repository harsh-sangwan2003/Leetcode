
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

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        depth = 0;

        helper(root, 0);

        return depth;
    }

    public void helper(TreeNode root, int lvl) {

        if (root == null) {

            depth = Math.max(depth, lvl);
            return;
        }

        helper(root.left, lvl + 1);
        helper(root.right, lvl + 1);

    }
}