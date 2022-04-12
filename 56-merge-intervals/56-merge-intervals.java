class Solution {
    public int[][] merge(int[][] arr) {

        Stack<int[]> st = new Stack<>();

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            int[] tmp = st.peek();

            if (arr[i][0] <= tmp[1]) {

                st.pop();
                int max = Math.max(tmp[1], arr[i][1]);
                st.push(new int[] { tmp[0], max });
            }

            else
                st.push(arr[i]);
        }

        int[][] res = new int[st.size()][2];
        int idx = res.length - 1;

        while (st.size() != 0) {

            int[] tmp = st.pop();

            res[idx][0] = tmp[0];
            res[idx][1] = tmp[1];
            idx--;
        }

        return res;
    }
}