class Solution {
    public boolean checkPowersOfThree(int n) {

        return helper(n, 1);
    }

    boolean helper(int n, int power) {
        if (n == 0)
            return true;

        if (power > n)
            return false;

        boolean op1 = helper(n, power * 3);
        boolean op2 = helper(n - power, power * 3);

        return op1 || op2;
    }
}