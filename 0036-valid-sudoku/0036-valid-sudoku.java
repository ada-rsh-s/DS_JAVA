class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> dupFound = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (char num : board[i]) {
                if (num == '.')
                    continue;
                if (!dupFound.add(num))
                    return false;
            }
            dupFound.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                if (!dupFound.add(board[j][i]))
                    return false;
            }
            dupFound.clear();
        }

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                 dupFound.clear();
                for (int j=row; j < row+3; j++) {
                    for (int k=col; k < col+3; k++) {
                        if (board[j][k] == '.')
                            continue;
                        if (!dupFound.add(board[j][k]))
                            return false;
                    }
                }
               

            }
        }

        return true;
    }
}