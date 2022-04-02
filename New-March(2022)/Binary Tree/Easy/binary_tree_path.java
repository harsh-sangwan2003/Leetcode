import java.util.List;
import java.util.ArrayList;

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
    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        if (root.left == null && root.right == null) {

            ArrayList<String> mres = new ArrayList<>();
            mres.add(root.val + "");
            return mres;
        }

        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);

        List<String> mres = new ArrayList<>();

        for (String s : left)
            mres.add(root.val + "->" + s);

        for (String s : right)
            mres.add(root.val + "->" + s);

        return mres;
    }
}