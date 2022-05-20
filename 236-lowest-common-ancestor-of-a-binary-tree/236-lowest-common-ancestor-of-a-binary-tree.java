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
    
    private List<TreeNode> find(TreeNode root, TreeNode node){
        
        if(root==null)
            return new ArrayList<>();
        
        if(root==node){
            
            List<TreeNode> bres = new ArrayList<>();
            bres.add(root);
            return bres;
        }
        
        List<TreeNode> left = find(root.left,node);
        if(left.size()!=0){
            
            left.add(root);
            return left;
        }
        
        List<TreeNode> right = find(root.right,node);
        if(right.size()!=0){
            
            right.add(root);
            return right;
        }
        
        return new ArrayList<>();
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        List<TreeNode> list1 = find(root,p);
        List<TreeNode> list2 = find(root,q);
        
        int i = list1.size()-1;
        int j = list2.size()-1;
        
        while(i>=0 && j>=0 && list1.get(i)==list2.get(j)){
            
            i--;
            j--;
        }
        
        i++;
        return list1.get(i);
    }
}