class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int row_length = matrix[0].length;
        int col_length = matrix.length;
        int top = 0, left = 0, right = row_length - 1, bottom = col_length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);

            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);

            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);

                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);

                }
                left++;
            }
        }

        return spiral;
    }
}