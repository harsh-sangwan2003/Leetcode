class Solution {

    public void transpose(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr[0].length; j++) {

                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

    }

    public void reverse(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int tmp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = tmp;

            lo++;
            hi--;
        }

    }

    public void rotate2(int[][] arr) {

        transpose(arr);

        for (int[] oned : arr)
            reverse(oned);
    }

    public void rotate(int[][] arr) {

        rotate2(arr);
    }
}