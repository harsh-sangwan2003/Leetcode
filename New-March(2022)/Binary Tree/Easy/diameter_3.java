
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

    private static int ans;

    public int height(TreeNode root) {

        if (root == null)
            return -1;

        int lh = height(root.left);
        int rh = height(root.right);

        ans = Math.max(ans, lh + rh + 2);

        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        ans = 0;
        height(root);
        return ans;
    }
}