class Solution {
    public double myPow(double x, int n) {

        if (n == 0 || x == 1)
            return 1.0;

        if (x == 0)
            return 0;

        if (n < 0)
            return 1 / x * myPow(1 / x, -(n + 1));

        double rres = myPow(x, n / 2);

        if (n % 2 == 0)
            return (double) (rres * rres);

        else
            return (double) (rres * rres * x);
    }
}