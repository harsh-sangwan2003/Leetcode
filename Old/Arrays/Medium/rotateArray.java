class Solution {
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public void reverse(int[] nums, int lo, int hi) {

        while (lo <= hi) {

            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;

            lo++;
            hi--;
        }

    }
}