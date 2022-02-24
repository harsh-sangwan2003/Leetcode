class Solution {
    public boolean isSubsequence(String s, String t) {

        int s_idx = 0;
        int t_idx = 0;

        while (s_idx < s.length() && t_idx < t.length()) {

            if (s.charAt(s_idx) == t.charAt(t_idx))
                s_idx++;

            t_idx++;
        }

        return s_idx == s.length();
    }
}