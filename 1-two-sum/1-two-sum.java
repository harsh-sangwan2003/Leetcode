class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            
            int comp = target - nums[i];
            
            if(map.containsKey(comp))
                return new int[]{i,map.get(comp)};
            
            map.put(nums[i],i);
        }
        
        return ans;
    }
}