class Solution {
    public int addDigits(int num) {

        if (num == 0)
            return 0;

        int ans = num % 9;

        if (ans == 0)
            return 9;

        else
            return ans;
    }
}