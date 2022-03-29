
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

    public class Pair {

        int height;
        int dia;

        Pair() {

        }

        Pair(int height, int dia) {

            this.height = height;
            this.dia = dia;
        }

    }

    public Pair diameter(TreeNode root) {

        if (root == null)
            return new Pair(-1, 0);

        Pair lp = diameter(root.left);
        Pair rp = diameter(root.right);

        Pair mp = new Pair();
        mp.height = Math.max(lp.height, rp.height) + 1;
        mp.dia = Math.max(lp.height + rp.height + 2, Math.max(lp.dia, rp.dia));

        return mp;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        return diameter(root).dia;
    }
}