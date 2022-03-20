class Solution {
    public int rotatedDigits(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (contains2569(i) && !contains347(i))
                count++;
        }

        return count;
    }

    public boolean contains2569(int num) {

        while (num != 0) {

            int rem = num % 10;

            if (rem == 2 || rem == 5 || rem == 6 || rem == 9)
                return true;

            num /= 10;
        }

        return false;
    }

    public boolean contains347(int num) {

        while (num != 0) {

            int rem = num % 10;

            if (rem == 3 || rem == 4 || rem == 7)
                return true;

            num /= 10;
        }

        return false;
    }
}