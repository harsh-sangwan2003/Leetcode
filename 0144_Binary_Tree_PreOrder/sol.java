//  Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        res.add(root.val);

        List<Integer> left = preorderTraversal(root.left);
        for (int val : left)
            res.add(val);

        List<Integer> right = preorderTraversal(root.right);
        for (int val : right)
            res.add(val);

        return res;
    }
}