//  Definition for a binary tree node.

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

public class sol {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh, rh) + 1;
    }
}