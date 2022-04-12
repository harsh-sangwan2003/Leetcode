class Solution {
    public int rotatedDigits(int n) {

        int count = 0;

        for (int x = 1; x <= n; x++) {

            if (contains2569(x) && !contains347(x))
                count++;
        }

        return count;
    }

    public boolean contains2569(int num) {

        while (num != 0) {

            int rem = num % 10;

            if (rem == 2 || rem == 6 || rem == 9 || rem == 5)
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