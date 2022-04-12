class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();

        for (String s : ops) {

            if (s.equals("+")) {

                int val1 = st.pop();
                int val2 = st.peek();
                int val = val1 + val2;
                st.push(val1);
                st.push(val);
            }

            else if (s.equals("D")) {

                int val = st.peek();
                st.push(2 * val);
            }

            else if (s.equals("C")) {

                st.pop();
            }

            else {

                st.push(Integer.valueOf(s));
            }
        }

        System.out.println(st);

        int ans = 0;

        while (st.size() != 0)
            ans += st.pop();

        return ans;
    }
}