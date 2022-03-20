import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();

        for (String s : ops) {

            if (s.equals("+")) {

                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            }

            else if (s.equals("D")) {

                st.push(2 * st.peek());
            }

            else if (s.equals("C"))
                st.pop();

            else
                st.push(Integer.valueOf(s));
        }

        int ans = 0;

        while (st.size() != 0)
            ans += st.pop();

        return ans;
    }
}