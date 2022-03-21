import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {

                int v2 = st.pop();
                int v1 = st.pop();
                st.push(calc(v1, v2, s));

            }

            else {

                st.push(Integer.valueOf(s));
            }

        }

        return st.pop();
    }

    public int calc(int v1, int v2, String s) {

        if (s.equals("+"))
            return v1 + v2;

        else if (s.equals("-"))
            return v1 - v2;

        else if (s.equals("*"))
            return v1 * v2;

        else
            return v1 / v2;
    }
}