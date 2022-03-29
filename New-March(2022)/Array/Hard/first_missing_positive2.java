class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean flag = false;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 1)
                flag = true;

            if (nums[i] <= 0 || nums[i] > nums.length)
                nums[i] = 1;
        }

        if (!flag)
            return 1;

        for (int i = 0; i < n; i++) {

            int idx = Math.abs(nums[i]);

            if (nums[idx - 1] > 0)
                nums[idx - 1] *= -1;
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0)
                return i + 1;
        }

        return n + 1;
    }
}