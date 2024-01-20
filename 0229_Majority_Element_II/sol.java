import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0, ele1 = 0, ele2 = 0;

        for (int val : nums) {
            if (count1 == 0 && val != ele2) {
                count1 = 1;
                ele1 = val;
            } else if (count2 == 0 && val != ele1) {
                count2 = 1;
                ele2 = val;
            } else if (val == ele1)
                count1++;
            else if (val == ele2)
                count2++;
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        // Reset the counters before counting again
        for (int val : nums) {
            if (ele1 == val)
                count1++;
            else if (ele2 == val)
                count2++;
        }

        int n = nums.length / 3;

        if (count1 > n)
            list.add(ele1);

        if (count2 > n)
            list.add(ele2);

        return list;
    }
}