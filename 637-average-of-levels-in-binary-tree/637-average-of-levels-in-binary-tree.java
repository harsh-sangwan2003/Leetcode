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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        
        q.add(root);
        
        while(q.size()!=0){
            
            Double temp = 0.0;
            int size = q.size();
            int ts = size;
            
            while(size-->0){
                
                TreeNode node = q.remove();
                temp += (double)(node.val);
                
                if(node.left!=null)
                q.add(node.left);
                
                if(node.right!=null)
                q.add(node.right);
                
            }
            
            list.add(temp/ts);
        }
        
        return list;
    }
}