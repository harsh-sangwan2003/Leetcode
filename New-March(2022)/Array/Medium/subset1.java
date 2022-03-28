import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);

        return res;
    }

    public void dfs(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res) {

        res.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {

            curr.add(nums[i]);
            dfs(nums, i + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}