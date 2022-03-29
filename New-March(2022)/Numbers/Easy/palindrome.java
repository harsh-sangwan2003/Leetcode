class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int res = reverse(x);

        return res == x;
    }

    public int reverse(int x) {

        int res = 0;

        while (x != 0) {

            int rem = x % 10;

            res = res * 10 + rem;
            x /= 10;
        }

        return res;
    }
}