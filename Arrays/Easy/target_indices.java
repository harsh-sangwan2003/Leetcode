import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                list.add(i);
                int j = i + 1;

                while (j < nums.length && nums[j] == target) {

                    list.add(j);
                    j++;
                }

                break;
            }

        }

        return list;
    }
}