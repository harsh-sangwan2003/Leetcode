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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        Stack<List<Integer>> st = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        while(q.size()!=0){
            
            TreeNode node = q.remove();
            
            if(node==null){
                
                if(q.size()>0){
                    
                    st.push(list);
                    list = new ArrayList<>();
                    q.add(null);
                }
            }
            
            else{
                
                list.add(node.val);
                
                if(node.left!=null)
                    q.add(node.left);
                
                if(node.right!=null)
                    q.add(node.right);
            }
        }
        
        st.push(list);
        
        while(st.size()>0){
        
            list = st.pop();
            res.add(list);
        }
    
        return res;
    }
}