//Problem 37 Leetcode
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') { //taken

                    for (char c = '1'; c <= '9'; c++) {
                        if (valid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board) == true) { //loop
                                return true;
                            } else
                                board[i][j] = '.'; //remove taken 
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean valid(char[][] board, int r, int c, char cc) {

        for (int i = 0; i < 9; i++) {

            if (board[i][c] == cc) return false; // check row number
            if (board[r][i] == cc) return false; // check column number

            if (board[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == cc) return false;
            //check logic of 3*3 matrix inside
        }
        return true;
    }

}
