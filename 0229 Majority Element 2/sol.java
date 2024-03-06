import java.util.ArrayList;
import java.util.List;

class sol {

    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0, a = 0, b = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count1 == 0 && nums[i] != b) {
                count1 = 1;
                a = nums[i];
            }

            else if (count2 == 0 && nums[i] != a) {
                count2 = 1;
                b = nums[i];
            }

            else if (a == nums[i])
                count1++;

            else if (b == nums[i])
                count2++;

            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (a == nums[i])
                count1++;

            else if (b == nums[i])
                count2++;
        }

        List<Integer> list = new ArrayList<>();

        if (count1 > nums.length / 3)
            list.add(a);

        if (count2 > nums.length / 3)
            list.add(b);

        return list;
    }
}