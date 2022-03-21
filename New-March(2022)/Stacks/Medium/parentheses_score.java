import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(')
                st.push(-1);

            else {

                int score = 0;

                if (st.peek() == -1) {

                    st.pop();
                    st.push(1);
                }

                else {

                    while (st.size() != 0 && st.peek() != -1) {

                        score += st.pop();

                    }

                    st.pop();
                    st.push(2 * score);
                }

            }
        }

        int ans = 0;

        while (st.size() != 0)
            ans += st.pop();

        return ans;
    }
}