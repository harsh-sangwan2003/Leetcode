/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public ArrayList<TreeNode> find(TreeNode root, TreeNode node){
        
        if(root==null)
            return new ArrayList<>();
        
        if(root.val==node.val){
            
            ArrayList<TreeNode> bres = new ArrayList<>();
            bres.add(root);
            return bres;
        }
        
        if(root.val<node.val){
            
            ArrayList<TreeNode> right = find(root.right,node);
            
            if(right.size()!=0){
                
                right.add(root);
                return right;
            }
        }
        
        else{
            
            ArrayList<TreeNode> left = find(root.left,node);
            
            if(left.size()!=0){
                
                left.add(root);
                return left;
            }
        }
        
        return new ArrayList<>();
    }
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> l1 = find(root,p);
        ArrayList<TreeNode> l2 = find(root,q);
        
        int i = l1.size()-1;
        int j = l2.size()-1;
        
        while(i>=0 && j>=0 && l1.get(i)==l2.get(j))
        {
            i--;
            j--;
        }
        
        i++;
        return l1.get(i);
    }
}