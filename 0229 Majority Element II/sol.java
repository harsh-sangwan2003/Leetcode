import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int count1 = 0, count2 = 0, ans1 = 0, ans2 = 0;

        for (int val : nums) {

            if (val == ans1)
                count1++;

            else if (val == ans2)
                count2++;

            else if (count1 == 0) {
                count1 = 1;
                ans1 = val;
            }

            else if (count2 == 0) {
                count2 = 1;
                ans2 = val;
            }

            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int val : nums) {

            if (val == ans1)
                count1++;

            else if (val == ans2)
                count2++;
        }

        int k = nums.length / 3;

        if (count1 > k)
            res.add(ans1);

        if (count2 > k)
            res.add(ans2);

        return res;
    }
}