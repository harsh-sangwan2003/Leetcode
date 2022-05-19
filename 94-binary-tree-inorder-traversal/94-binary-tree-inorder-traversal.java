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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        TreeNode curr = root;
        
        while(curr!=null){
            
            //if left is null
            if(curr.left==null){
                
                list.add(curr.val);
                curr = curr.right;
            }
            
            else{
                
                TreeNode iop = curr.left;
                while(iop.right!=null && iop.right!=curr){
                    
                    iop = iop.right;
                }
                
                //iop -> Inorder Predecessor
                if(iop.right==null){
                    
                    //Making a thread
                    iop.right = curr;
                    curr = curr.left;
                }
                
                else{
                    
                    iop.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        
        return list;
    }
}