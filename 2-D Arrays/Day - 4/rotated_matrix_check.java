class Solution {

    public void transpose(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr[0].length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[] arr) {

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

    public void rotate(int[][] arr) {

        transpose(arr);

        for (int[] d : arr)
            reverse(d);

    }

    public boolean check(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1[0].length; j++) {

                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }

        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        if (check(mat, target))
            return true;

        rotate(mat);
        if (check(mat, target))
            return true;

        rotate(mat);
        if (check(mat, target))
            return true;

        rotate(mat);
        if (check(mat, target))
            return true;

        return false;
    }
}