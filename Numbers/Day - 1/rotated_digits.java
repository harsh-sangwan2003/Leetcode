class Solution {

    public boolean good(int num) {

        boolean flag = false;

        while (num != 0) {

            int rem = num % 10;
            num /= 10;

            if (rem == 3 || rem == 4 || rem == 7)
                return false;

            else if (rem == 2 || rem == 5 || rem == 6 || rem == 9)
                flag = true;
        }

        return flag;
    }

    public int rotatedDigits(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (good(i))
                count++;
        }

        return count;
    }
}