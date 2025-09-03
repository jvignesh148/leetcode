class Solution {
    int solution=0,max=0;
    public int findMaxFish(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    max=0;
                    dfs(i,j,grid,visited);
                    solution=Math.max(max,solution);
                }
            }
        }
        return solution;
    }
    public void dfs(int n, int m, int[][] grid, boolean[][] visited){
        if(n<0 || m<0 || n>=grid.length || m>=grid[0].length || visited[n][m] || grid[n][m]==0) return;
        visited[n][m]=true;
        max+=grid[n][m];
        dfs(n-1,m,grid,visited);
        dfs(n+1,m,grid,visited);
        dfs(n,m-1,grid,visited);
        dfs(n,m+1,grid,visited);
    }
}