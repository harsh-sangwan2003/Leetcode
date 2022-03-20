import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), res);

        return res;
    }

    public void helper(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res) {

        res.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {

            if (i > idx && nums[i - 1] == nums[i])
                continue;

            curr.add(nums[i]);

            helper(nums, i + 1, curr, res);

            curr.remove(curr.size() - 1);
        }
    }
}