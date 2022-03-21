// Time - O(2^n)
// Space - O(n)

class Solution {
    public boolean checkPowersOfThree(int n) {

        return helper(1, n);
    }

    public boolean helper(int x, int n) {

        if (x > n)
            return false;

        if (x == n)
            return true;

        if (n < 0)
            return false;

        if (n == 0)
            return true;

        boolean include = helper(x * 3, n - x);
        boolean exclude = helper(x * 3, n);

        return (include || exclude);
    }
}