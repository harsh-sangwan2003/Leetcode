import java.util.List;
import java.util.ArrayList;

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
                lo = mid - 1;
                hi = mid + 1;

                while (lo >= 0 && nums[lo] == target) {
                    list.add(0, lo);
                    lo--;
                }

                while (hi < nums.length && nums[hi] == target) {

                    list.add(hi);
                    hi++;
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