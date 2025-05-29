class Solution {
    public int findNeighbours(int[][] board, int rows, int cols, int orgRows, int orgCols) {
        int neighbourCount = 0;
        for (int i = rows - 1; i <= rows + 1; i++) {
            for (int j = cols - 1; j <= cols + 1; j++) {
                if ((i == rows && j == cols) || i > orgRows || i < 0 || j > orgCols || j < 0)
                    continue;
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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int neighbourCount = findNeighbours(board, i , j , rows - 1, cols - 1);

                if (board[i][j] == 1){ 
                    if  (neighbourCount == 2 || neighbourCount == 3) {
                        board[i][j] = 6;
                    } else {
                        board[i][j] = 5;
                }
                }
                else{ 
                    if(neighbourCount == 3){ 
                        board[i][j] = 4;
                    }
                    else {
                    board[i][j] = 3;
                    }
            }

            }
        }

        for (

                int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 3 || board[i][j] == 5)
                    board[i][j] = 0;
                else
                    board[i][j] = 1;
            }
        }
    }
}