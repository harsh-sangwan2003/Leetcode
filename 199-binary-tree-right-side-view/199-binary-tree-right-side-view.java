/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<Integer> list = new ArrayList<>();

        while (q.size() != 0) {

            int sz = q.size();

            for (int i = 0; i < sz; i++) {

                TreeNode node = q.remove();

                if (i == sz-1)
                    list.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

        }

        return list;
    }
}