class Solution {
    public void rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (j > i) {

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for (int[] oned : arr)
            reverse(oned);

    }

    private void reverse(int[] arr) {

        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }
}