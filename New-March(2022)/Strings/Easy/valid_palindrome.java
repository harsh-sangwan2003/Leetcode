class Solution {
    public boolean isPalindrome(String s) {

        int lo = 0;
        int hi = s.length() - 1;

        while (lo <= hi) {

            char st = s.charAt(lo);
            char et = s.charAt(hi);

            if (!Character.isLetterOrDigit(st))
                lo++;

            else if (!Character.isLetterOrDigit(et))
                hi--;

            else {

                if (Character.toLowerCase(st) != Character.toLowerCase(et))
                    return false;

                else {

                    lo++;
                    hi--;
                }
            }
        }

        return true;
    }
}