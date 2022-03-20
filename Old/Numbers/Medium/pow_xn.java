class Solution {
    public double myPow(double x, int n) {

        return myPow2(x, n);
    }

    public double myPow2(double x, long n) {

        if (n == 0)
            return 1.0;

        if (n == 1)
            return x;

        if (n < 0)
            return myPow2(1 / x, -n);

        double res = myPow2(x, n / 2);

        if (n % 2 == 0)
            return res * res;

        else
            return res * res * x;
    }

}