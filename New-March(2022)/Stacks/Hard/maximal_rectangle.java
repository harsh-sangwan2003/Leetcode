import java.util.Stack;

class Solution {

    public void print(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public int maximalRectangle(char[][] arr) {

        int[] heights = new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {

            heights[i] = arr[0][i] - '0';
        }

        int ans = calcArea(heights);

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == '1')
                    ++heights[j];

                else
                    heights[j] = 0;
            }

            ans = Math.max(ans, calcArea(heights));
        }

        return ans;
    }

    public int calcArea(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int[] nsel = new int[arr.length];
        st.push(0);
        nsel[0] = -1;

        for (int i = 1; i < arr.length; i++) {

            while (st.size() != 0 && arr[i] <= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nsel[i] = -1;

            else
                nsel[i] = st.peek();

            st.push(i);
        }

        st = new Stack<>();
        int[] nser = new int[arr.length];
        st.push(arr.length - 1);
        nser[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] <= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nser[i] = arr.length;

            else
                nser[i] = st.peek();

            st.push(i);
        }

        int res = -1;

        for (int i = 0; i < arr.length; i++) {

            int width = nser[i] - nsel[i] - 1;
            int curr = arr[i] * width;

            res = Math.max(res, curr);
        }

        return res;
    }
}