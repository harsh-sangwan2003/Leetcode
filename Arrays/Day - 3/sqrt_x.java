class Solution {
    public int mySqrt(int n) {

        if (n == 0)
            return 0;

        if (n == 1 || n == 2 || n == 3)
            return 1;

        int lo = 0;
        int hi = n;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (mid == n / mid)
                return mid;

            else if (mid < n / mid)
                lo = mid + 1;

            else
                hi = mid - 1;
        }

        return lo - 1;
    }
}