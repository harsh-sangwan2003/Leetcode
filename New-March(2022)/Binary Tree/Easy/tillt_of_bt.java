
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

    private static int tilt;

    public int findTilt(TreeNode root) {

        tilt = 0;
        helper(root);
        return tilt;
    }

    public int helper(TreeNode root) {

        if (root == null)
            return 0;

        int lsum = helper(root.left);
        int rsum = helper(root.right);

        tilt += Math.abs(lsum - rsum);

        return lsum + rsum + root.val;
    }
}