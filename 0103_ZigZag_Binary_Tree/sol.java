//  Definition for a binary tree node.
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int lvl = 0;
        List<List<Integer>> res = new ArrayList<>();

        while (q.size() != 0) {

            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= size; i++) {
                TreeNode node = q.remove();
                list.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            if (lvl % 2 == 1)
                Collections.reverse(list);

            lvl++;
            res.add(list);
        }

        return res;
    }
}