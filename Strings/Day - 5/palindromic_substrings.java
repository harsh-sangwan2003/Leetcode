class Solution {

    public boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str);

        int lo = 0;
        int hi = sb.length() - 1;

        while (lo <= hi) {

            char start = sb.charAt(lo);
            char end = sb.charAt(hi);

            if (start != end)
                return false;

            lo++;
            hi--;
        }

        return true;
    }

    public int countSubstrings(String s) {

        if (s.length() == 1)
            return 1;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                StringBuilder sb = new StringBuilder(s.substring(i, j));

                if (isPalindrome(sb.toString()))
                    count++;
            }
        }

        return count;
    }
}