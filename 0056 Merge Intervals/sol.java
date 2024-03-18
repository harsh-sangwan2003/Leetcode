import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class sol {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> old = new ArrayList<>();

        for (int[] interval : intervals)
            old.add(interval);

        List<int[]> res = new ArrayList<>();
        int[] curr = old.get(0);
        res.add(curr);

        for (int i = 1; i < old.size(); i++) {

            int st = old.get(i)[0];
            int et = old.get(i)[1];

            if (st <= curr[1]) {
                curr[0] = Math.min(curr[0], st);
                curr[1] = Math.max(curr[1], et);
            }

            else {
                curr = old.get(i);
                res.add(curr);
            }
        }

        int[][] arr = new int[res.size()][];
        int idx = 0;

        for (int[] temp : res)
            arr[idx++] = temp;

        return arr;
    }
}