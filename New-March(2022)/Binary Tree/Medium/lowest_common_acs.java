import java.util.ArrayList;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data) {
        // write your code here
        if (node == null)
            return new ArrayList<>();

        if (node.val == data) {

            ArrayList<TreeNode> bres = new ArrayList<>();
            bres.add(node);
            return bres;
        }

        ArrayList<TreeNode> left = nodeToRootPath(node.left, data);
        if (left.size() > 0) {

            left.add(node);
            return left;
        }

        ArrayList<TreeNode> right = nodeToRootPath(node.right, data);
        if (right.size() != 0) {

            right.add(node);
            return right;
        }

        return new ArrayList<>();
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        ArrayList<TreeNode> p1 = nodeToRootPath(root, p.val);
        ArrayList<TreeNode> p2 = nodeToRootPath(root, q.val);

        int i = p1.size() - 1;
        int j = p2.size() - 1;
        TreeNode LCA = null;

        while (i >= 0 && j >= 0) {

            if (p1.get(i).val != p2.get(j).val)
                break;

            LCA = p1.get(i);

            i--;
            j--;
        }

        return LCA;

    }
}