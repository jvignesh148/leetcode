class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return backtrack(grid, 0, 0, 0, grid.length);
    }
    public boolean backtrack(int[][] grid, int row, int col, int num, int n) {
        if(row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != num) {
            return false;
        }
        if(grid[row][col] == (n * n - 1)) {
            return true;
        }
        boolean a1 = backtrack(grid, row - 2, col - 1, grid[row][col] + 1, n); 
        boolean a2 = backtrack(grid, row - 2, col + 1, grid[row][col] + 1, n); 
        boolean a3 = backtrack(grid, row - 1, col - 2, grid[row][col] + 1, n); 
        boolean a4 = backtrack(grid, row - 1, col + 2, grid[row][col] + 1, n); 
        boolean a5 = backtrack(grid, row + 1, col - 2, grid[row][col] + 1, n); 
        boolean a6 = backtrack(grid, row + 1, col + 2, grid[row][col] + 1, n); 
        boolean a7 = backtrack(grid, row + 2, col - 1, grid[row][col] + 1, n); 
        boolean a8 = backtrack(grid, row + 2, col + 1, grid[row][col] + 1, n);
        return a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8;
    }
}