class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] res = { -1, -1 };

        int fi = firstIndex(nums, target);
        int li = lastIndex(nums, target);

        res[0] = fi;
        res[1] = li;

        return res;
    }

    public int firstIndex(int[] arr, int target) {

        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {

                ans = mid;
                hi = mid - 1;
            }

            else if (arr[mid] > target)
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return ans;
    }

    public int lastIndex(int[] arr, int target) {

        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {

                ans = mid;
                lo = mid + 1;
            }

            else if (arr[mid] > target)
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return ans;
    }
}