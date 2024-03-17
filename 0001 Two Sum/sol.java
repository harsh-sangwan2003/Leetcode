import java.util.Arrays;

class sol {

    private class Pair {

        int val;
        int idx;

        public Pair(int val, int idx) {

            this.val = val;
            this.idx = idx;
        }
    }

    public int[] twoSum(int[] nums, int target) {

        Pair[] pairs = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++)
            pairs[i] = new Pair(nums[i], i);

        Arrays.sort(pairs, (p1, p2) -> p1.val - p2.val);

        int lo = 0, hi = nums.length - 1;

        int[] res = { -1, -1 };

        while (lo <= hi) {

            int left = pairs[lo].val;
            int right = pairs[hi].val;

            if (left + right == target) {
                res[0] = pairs[lo].idx;
                res[1] = pairs[hi].idx;
                return res;
            }

            else if (left + right > target)
                hi--;

            else
                lo++;
        }

        return res;
    }
}