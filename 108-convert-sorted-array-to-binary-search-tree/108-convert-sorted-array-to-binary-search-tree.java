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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int lo = 0;
        int hi = nums.length-1;
        
        int mid = lo + (hi-lo)/2;
        
        return helper(nums,lo,hi);
    }
    
    public TreeNode helper(int[] nums, int lo, int hi){
        
        if(lo>hi)
            return null;
        
        if(lo==hi)
            return new TreeNode(nums[lo]);
        
        int mid = lo + (hi-lo)/2;
        TreeNode left = helper(nums,lo,mid-1);
        TreeNode right = helper(nums,mid+1,hi);
        
        TreeNode node = new TreeNode(nums[mid]);
        node.left = left;
        node.right = right;
        
        return node;
    }
}