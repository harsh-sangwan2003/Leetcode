import java.util.List;
import java.util.ArrayList;

class Solution {
    
    private static List<List<Integer>> result;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        result = new ArrayList<>();
        
        generateSubsets(nums,0,new ArrayList<>());
        return result;
    }
    
    public void generateSubsets(int[] nums, int idx, List<Integer> curr){
        
        if(idx==nums.length){
            
            result.add(curr);
            
            return;
        }
        
        curr.add(nums[idx]);
        generateSubsets(nums,idx+1,new ArrayList<>(curr));
        curr.remove(curr.size()-1);
        generateSubsets(nums,idx+1,new ArrayList<>(curr));
    }
}