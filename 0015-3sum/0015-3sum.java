class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){

            if(i==0 || nums[i]!=nums[i-1])
            twoSum(i+1,nums.length-1,nums,res,0-nums[i]);
        }

        return res;
    }

    private void twoSum(int i, int j, int[] nums, List<List<Integer>> res, int tar){

        int a = nums[i-1];

        while(i<j){

            if(nums[i]+nums[j]<tar)
            i++;

            else if(nums[i]+nums[j]>tar)
            j--;

            else{

                List<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);

                while(i<j && nums[i]==nums[i+1])
                i++;

                while(i<j && nums[j]==nums[j-1])
                j--;

                i++;
                j--;
            }
        }
    }
}