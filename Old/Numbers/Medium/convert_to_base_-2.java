class Solution {
    public String baseNeg2(int n) {

        if (n == 0)
            return "0";

        StringBuilder sb = new StringBuilder();

        while (n != 0) {

            if (Math.abs(n) % 2 == 1) {

                sb.append("1");
                n = (n - 1) / (-2);
            }

            else {

                sb.append("0");
                n = n / (-2);
            }
        }

        sb = sb.reverse();
        return sb.toString();
    }
}