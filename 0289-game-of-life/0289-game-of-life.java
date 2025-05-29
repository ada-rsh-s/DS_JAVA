class Solution {
    public int findNeighbours(int[][] board, int rows, int cols, int orgRows, int orgCols) {
        int neighbourCount = 0;
        for (int i = rows - 1; i <= rows + 1; i++) {
            for (int j = cols - 1; j <= cols + 1; j++) {
                if ((i == rows && j == cols) || i > orgRows || i < 0 || j > orgCols || j < 0)
                    continue;

                // Check if it was originally alive
                if (board[i][j] == 1 || board[i][j] == 5 || board[i][j] == 6) {
                    neighbourCount++;
                }
            }
        }
        return neighbourCount;
    }

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // First pass: mark transitions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int neighbourCount = findNeighbours(board, i, j, rows - 1, cols - 1);

                if (board[i][j] == 1) { // alive
                    if (neighbourCount == 2 || neighbourCount == 3) {
                        board[i][j] = 5; // stays alive
                    } else {
                        board[i][j] = 6; // becomes dead
                    }
                } else { // dead
                    if (neighbourCount == 3) {
                        board[i][j] = 4; // becomes alive
                    } else {
                        board[i][j] = 3; // stays dead
                    }
                }
            }
        }

        // Second pass: decode final states
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 4 || board[i][j] == 5) {
                    board[i][j] = 1; // alive
                } else {
                    board[i][j] = 0; // dead
                }
            }
        }
    }
}
