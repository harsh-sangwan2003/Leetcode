import java.util.Stack;
import java.util.Arrays;

class Solution {

    public class Pairs implements Comparable<Pairs> {

        int st;
        int et;

        Pairs(int st, int et) {

            this.st = st;
            this.et = et;
        }

        public int compareTo(Pairs o) {

            if (this.st != o.st)
                return this.st - o.st;

            else
                return this.et - o.et;
        }
    }

    public int[][] merge(int[][] arr) {

        Pairs[] pair = new Pairs[arr.length];

        for (int i = 0; i < pair.length; i++)
            pair[i] = new Pairs(arr[i][0], arr[i][1]);

        Arrays.sort(pair);

        Stack<Pairs> st = new Stack<>();

        for (int i = 0; i < pair.length; i++) {

            if (st.size() == 0)
                st.push(pair[i]);

            else {

                Pairs p = st.peek();

                if (pair[i].st > p.et)
                    st.push(pair[i]);

                else
                    p.et = Math.max(pair[i].et, p.et);
            }
        }

        int[][] ans = new int[st.size()][2];

        int i = ans.length - 1;

        while (st.size() != 0) {

            Pairs p = st.pop();

            ans[i][0] = p.st;
            ans[i][1] = p.et;

            i--;
        }

        return ans;
    }
}