class Solution {

    private int firstIndex(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {

                ans = mid;
                hi = mid - 1;
            }

            else if (arr[mid] < tar)
                lo = mid + 1;

            else
                hi = mid - 1;
        }

        return ans;
    }

    private int lastIndex(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {

                ans = mid;
                lo = mid + 1;
            }

            else if (arr[mid] < tar)
                lo = mid + 1;

            else
                hi = mid - 1;
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        if (nums == null || nums.length == 0)
            return new int[] { -1, -1 };

        int fi = firstIndex(nums, target);
        int li = lastIndex(nums, target);

        return new int[] { fi, li };
    }
}