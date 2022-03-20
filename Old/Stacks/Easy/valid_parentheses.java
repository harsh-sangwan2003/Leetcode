import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);

            else if (ch == ')') {

                flag = handle(st, '(');

                if (!flag)
                    return false;
            }

            else if (ch == '}') {

                flag = handle(st, '{');

                if (!flag)
                    return false;
            }

            else {

                flag = handle(st, '[');

                if (!flag)
                    return false;
            }

        }

        if (st.size() == 0)
            return true;

        return false;
    }

    public boolean handle(Stack<Character> st, char ch) {

        if (st.size() == 0)
            return false;

        if (st.peek() != ch)
            return false;

        st.pop();
        return true;
    }
}