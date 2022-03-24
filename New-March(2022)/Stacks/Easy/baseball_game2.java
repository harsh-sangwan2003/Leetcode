import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {

        ArrayList<Integer> al = new ArrayList<>();

        for (String s : ops) {

            if (s.equals("+")) {

                int val = al.remove(al.size() - 1);
                int res = al.get(al.size() - 1) + val;
                al.add(val);
                al.add(res);
            }

            else if (s.equals("D")) {

                al.add(2 * al.get(al.size() - 1));
            }

            else if (s.equals("C")) {

                al.remove(al.size() - 1);
            }

            else {

                al.add(Integer.valueOf(s));
            }
        }

        int ans = 0;

        while (al.size() != 0)
            ans += al.remove(al.size() - 1);

        return ans;
    }
}