import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        generateSubsets(0, nums, res, new ArrayList<>());

        return res;
    }

    private void generateSubsets(int index, int[] nums, List<List<Integer>> res, List<Integer> list) {

        res.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {

            list.add(nums[i]);
            generateSubsets(i + 1, nums, res, list);
            list.remove(list.size() - 1);
        }
    }
}