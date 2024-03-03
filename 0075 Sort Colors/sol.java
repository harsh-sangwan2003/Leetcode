class sol {

    public void sortColors(int[] nums) {

        int i = 0, j = 0, k = nums.length - 1;

        while (i <= k) {

            if (nums[i] == 1)
                i++;

            else if (nums[i] == 0) {

                swap(nums, i, j);
                i++;
                j++;
            }

            else {

                swap(nums, i, k);
                k--;
            }
        }
    }

    private void swap(int[] nums, int x, int y) {

        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}