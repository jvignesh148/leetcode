class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int mod =(int) (1e9 + 7);
        int[][][] dp = new int[n][m][k];
        dp[0][0][grid[0][0] % k] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int l = 0; l < k; l++) {
                    if(dp[i][j][l] == 0) continue;
                    if(i + 1 < n) {
                        int remainder = (grid[i + 1][j] + l) % k;
                        int val = dp[i + 1][j][remainder] + dp[i][j][l];
                        dp[i + 1][j][remainder] = val % mod;
                    }
                    if(j + 1 < m) {
                        int remainder = (grid[i][j + 1] + l) % k;
                        int val = dp[i][j + 1][remainder] + dp[i][j][l];
                        dp[i][j + 1][remainder] = val % mod;
                    }
                }
            }
        }
        return dp[n-1][m-1][0];
    }
}