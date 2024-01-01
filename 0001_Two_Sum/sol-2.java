import java.util.Arrays;

class Solution {

    public class Pair implements Comparable<Pair> {

        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Pair o) {

            return this.val - o.val;
        }
    }

    public int[] twoSum(int[] nums, int target) {

        Pair[] arr = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++)
            arr[i] = new Pair(nums[i], i);

        Arrays.sort(arr);

        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {

            int left = arr[lo].val;
            int right = arr[hi].val;

            if (left + right == target) {
                return new int[] { arr[lo].idx, arr[hi].idx };
            }

            else if (left + right < target)
                lo++;

            else
                hi--;
        }

        return new int[] { -1, -1 };
    }
}