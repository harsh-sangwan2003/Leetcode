// Time - O(n)
// Space - O(n)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {

                int left = map.get(target - nums[i]);
                return new int[] { left, i };
            }

            else {

                map.put(nums[i], i);
            }
        }

        return new int[2];
    }
}