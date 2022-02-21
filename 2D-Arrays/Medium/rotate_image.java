class Solution {
    public void rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr[0].length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] oned : arr)
            reverse(oned);

    }

    public void reverse(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }

    }
}