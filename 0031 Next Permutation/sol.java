class sol {

    public void nextPermutation(int[] nums) {

        if (nums.length == 1)
            return;

        int k = nums.length - 2;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] >= nums[i + 1])
                k--;

            else
                break;
        }

        if (k < 0) {
            reverse(nums, 0);
            return;
        }

        for (int i = nums.length - 1; i > k; i--) {

            if (nums[i] > nums[k]) {

                swap(nums, i, k);
                reverse(nums, k + 1);
                return;
            }
        }
    }

    private void reverse(int[] arr, int st) {

        int hi = arr.length - 1;

        while (st <= hi) {

            swap(arr, st, hi);
            st++;
            hi--;
        }
    }

    private void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}