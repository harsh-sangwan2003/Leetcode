import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {

                list.add(mid);

                int i = mid - 1;
                int j = mid + 1;

                while (i >= 0 && nums[i] == target) {

                    list.add(0, i);
                    i--;
                }

                while (j < nums.length && nums[j] == target) {

                    list.add(j);
                    j++;
                }

                return list;
            }

            else if (nums[mid] > target)
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return list;
    }
}