import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;

        int count = 0;
        int ne = arr.length * arr[0].length;

        List<Integer> list = new ArrayList<>();

        while (count < ne) {

            // Top
            for (int c = minc; c <= maxc && count < ne; c++) {

                list.add(arr[minr][c]);
                count++;
            }
            minr++;

            // Right
            for (int r = minr; r <= maxr && count < ne; r++) {

                list.add(arr[r][maxc]);
                count++;
            }
            maxc--;

            // Bottom
            for (int c = maxc; c >= minc && count < ne; c--) {

                list.add(arr[maxr][c]);
                count++;
            }
            maxr--;

            // Left
            for (int r = maxr; r >= minr && count < ne; r--) {

                list.add(arr[r][minc]);
                count++;
            }
            minc++;

        }

        return list;
    }
}