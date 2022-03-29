import java.util.Set;
import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int val : nums) {

            if (!set.contains(val) && val > 0)
                set.add(val);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i))
                return i;
        }

        return nums.length + 1;
    }
}