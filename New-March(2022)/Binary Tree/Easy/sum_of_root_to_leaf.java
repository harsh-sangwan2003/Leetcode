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
    static int sum;

    public int sumRootToLeaf(TreeNode root) {

        sum = 0;

        helper(root, new String(""));

        return sum;
    }

    public void helper(TreeNode root, String sb) {

        if (root == null) {

            return;
        }

        if (root.left == null && root.right == null) {

            sb += root.val;
            sum += Integer.parseInt(sb, 2);
            return;
        }

        helper(root.left, sb + root.val + "");

        helper(root.right, sb + root.val + "");
    }
}