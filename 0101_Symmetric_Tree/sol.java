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

    public boolean isSame(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null || p.val != q.val)
            return false;

        return isSame(p.left, q.right) && isSame(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        return isSame(root.left, root.right);
    }
}