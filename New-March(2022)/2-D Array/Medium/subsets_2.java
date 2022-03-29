import java.util.List;
import java.util.ArrayList;

class Solution {

    private static List<List<Integer>> result;

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        result = new ArrayList<>();

        helper(nums, 0, new ArrayList<>());

        return result;
    }

    public void helper(int[] nums, int idx, List<Integer> list) {

        if (idx == nums.length) {

            if (!result.contains(list))
                result.add(list);

            return;
        }

        list.add(nums[idx]);
        helper(nums, idx + 1, new ArrayList<>(list));

        list.remove(list.size() - 1);
        if (list.size() > 0 && nums[idx] != list.get(list.size() - 1))
            ;
        helper(nums, idx + 1, new ArrayList<>(list));
    }
}