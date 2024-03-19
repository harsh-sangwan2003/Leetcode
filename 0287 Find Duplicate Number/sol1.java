import java.util.HashSet;

class sol1 {

    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int val : nums) {

            if (set.contains(val))
                return val;

            set.add(val);
        }

        return -1;
    }
}