// Time - O(1)
// Space - O(1)

class Solution {
    public int addDigits(int num) {

        if (num == 0)
            return 0;

        int rem = num % 9;

        if (rem == 0)
            return 9;

        return rem;
    }
}