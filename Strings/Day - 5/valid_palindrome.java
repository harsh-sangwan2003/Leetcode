class Solution {
    public boolean isPalindrome(String str) {

        if (str.length() == 0 || str == null || str == " " || str.length() == 1)
            return true;

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || Character.isDigit(ch))
                sb.append(Character.toLowerCase(ch));
        }

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
}