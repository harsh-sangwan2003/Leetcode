import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        helper(nums, 0, new ArrayList<Integer>(), res);

        return res;
    }

    public void helper(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res) {

        res.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {

            curr.add(nums[i]);

            helper(nums, i + 1, curr, res);

            curr.remove(curr.size() - 1);
        }

    }
}