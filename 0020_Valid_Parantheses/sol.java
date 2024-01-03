import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            boolean flag = true;

            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);

            else if (ch == ')') {

                flag = check(st, '(');

                if (!flag)
                    return false;
            }

            else if (ch == '}') {

                flag = check(st, '{');

                if (!flag)
                    return false;
            }

            else if (ch == ']') {

                flag = check(st, '[');

                if (!flag)
                    return false;
            }

        }

        return st.size() == 0;
    }

    public boolean check(Stack<Character> st, char ch) {

        if (st.size() == 0)
            return false;

        if (st.peek() != ch)
            return false;

        st.pop();
        return true;
    }
}