class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length, m = board[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int lives = counter(board, i, j, n, m);
                if(board[i][j] == 1 && (lives == 2 || lives == 3)) board[i][j] = 3;
                if(board[i][j] == 0 && lives == 3) board[i][j] = 2;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) board[i][j] >>= 1;
        }
    }
    public int counter(int[][] board, int r, int c, int n, int m) {
        int count = 0;
        for(int i = r - 1; i <= r + 1; i++) {
            for(int j = c - 1; j <= c + 1; j++) {
                if(i == r && j == c) continue;
                if (i >= 0 && i < n && j >= 0 && j < m && (board[i][j] & 1) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}