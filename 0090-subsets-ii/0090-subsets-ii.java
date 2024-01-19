class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        generateSubsets(0,nums,res,new ArrayList<>());

        return res;
    }

    private void generateSubsets(int index, int[] nums, List<List<Integer>> res, List<Integer> list){

        res.add(new ArrayList<>(list));

        for(int i=index; i<nums.length; i++){

            if(i>index && nums[i]==nums[i-1])
            continue;
            
            list.add(nums[i]);
            generateSubsets(i+1,nums,res,list);
            list.remove(list.size()-1);
        }
    }
}