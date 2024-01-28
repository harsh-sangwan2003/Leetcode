import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class sol {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1)
        return intervals;

        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));

        List<int[]> output_arr = new ArrayList<>();
        int[] current = intervals[0];
        output_arr.add(current);

        for(int[] interval : intervals){

            int current_st = current[0], current_et = current[1];
            int next_st = interval[0], next_et = interval[1];

            if(current_et>=next_st)
            current[1] = Math.max(current_et,next_et);

            else{

                current = interval;
                output_arr.add(current);
            }
        }

        return output_arr.toArray(new int[output_arr.size()][]);
    }
}