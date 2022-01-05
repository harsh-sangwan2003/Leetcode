import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int end = (int) Math.pow(2, nums.length);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < end; i++) {

            List<Integer> list = new ArrayList<>();
            int temp = i;
            for (int j = nums.length - 1; j >= 0; j--) {

                int rem = temp % 2;
                temp /= 2;

                if (rem != 0) {

                    list.add(0, nums[j]);
                }
            }

            res.add(list);
        }

        return res;
    }
}