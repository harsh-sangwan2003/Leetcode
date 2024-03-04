class sol {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int k = n - 2;

        for (int i = n - 1; i > 0; i--) {

            if (nums[i] <= nums[i - 1])
                k--;

            else
                break;
        }

        if (k == -1) {

            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] > nums[k]) {

                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                reverse(nums, k + 1, n - 1);
                return;
            }
        }
    }

    private void reverse(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
}