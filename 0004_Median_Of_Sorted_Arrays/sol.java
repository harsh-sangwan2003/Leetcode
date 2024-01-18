class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                res[k] = nums1[i];
                i++;
            }

            else {

                res[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {

            res[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {

            res[k] = nums2[j];
            j++;
            k++;
        }

        int size = res.length;
        double ans = 1.00;

        if (size % 2 == 0) {

            ans = (res[size / 2] * 1.00 + res[size / 2 - 1]) / 2;
        }

        else {

            ans = (double) res[size / 2];
        }

        return ans;
    }
}