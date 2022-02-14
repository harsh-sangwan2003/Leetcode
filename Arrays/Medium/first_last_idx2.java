class Solution {

    public int firstIndex(int[] nums, int target, int lo, int hi) {

        if (lo > hi)
            return -1;

        if (lo == hi) {

            if (nums[lo] == target)
                return lo;

            else
                return -1;
        }

        int mid = lo + (hi - lo) / 2;
        int pans = -1;

        if (nums[mid] == target) {

            pans = mid;
            int temp = firstIndex(nums, target, lo, mid - 1);

            if (temp != -1)
                pans = temp;
        }

        else if (nums[mid] > target)
            pans = firstIndex(nums, target, lo, mid - 1);

        else
            pans = firstIndex(nums, target, mid + 1, hi);

        return pans;
    }

    public int lastIndex(int[] nums, int target, int lo, int hi) {

        if (lo > hi)
            return -1;

        if (lo == hi) {

            if (nums[lo] == target)
                return lo;

            else
                return -1;
        }

        int mid = lo + (hi - lo) / 2;
        int pans = -1;

        if (nums[mid] == target) {

            pans = mid;
            int temp = lastIndex(nums, target, mid + 1, hi);

            if (temp != -1)
                pans = temp;
        }

        else if (nums[mid] > target)
            pans = lastIndex(nums, target, lo, mid - 1);

        else
            pans = lastIndex(nums, target, mid + 1, hi);

        return pans;
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];

        int fi = firstIndex(nums, target, 0, nums.length - 1);
        int li = lastIndex(nums, target, 0, nums.length - 1);

        ans[0] = fi;
        ans[1] = li;

        return ans;
    }
}