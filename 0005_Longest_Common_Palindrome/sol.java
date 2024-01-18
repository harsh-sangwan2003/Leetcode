class Solution {
    public String longestPalindrome(String s) {

        String res = "";
        int len = 0, st = 0;

        for (int c = 0; c < s.length(); c++) {

            int i = c - 1;
            int j = c + 1;
            boolean flag = false;

            while (i >= 0 && j < s.length()) {

                if (s.charAt(i) != s.charAt(j))
                    break;

                flag = true;
                i--;
                j++;
            }

            if (j - i - 1 > len) {

                len = j - i - 1;

                if (flag)
                    st = ++i;
            }
        }

        for (int c = 0; c < s.length(); c++) {

            int i = c;
            int j = c + 1;
            boolean flag = false;

            while (i >= 0 && j < s.length()) {

                if (s.charAt(i) != s.charAt(j))
                    break;

                flag = true;
                i--;
                j++;
            }

            if (j - i - 1 > len) {

                len = j - i - 1;

                if (flag)
                    st = ++i;
            }
        }

        for (int i = 0; i < len; i++) {

            res += s.charAt(st + i);
        }

        return res;
    }
}