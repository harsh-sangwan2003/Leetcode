class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1;

        while (true) {

            if (matrix[r][c] == target)
                return true;

            else if (matrix[r][c] < target)
                r++;

            else
                c--;

            if (r >= matrix.length || c < 0)
                break;
        }

        return false;
    }
}