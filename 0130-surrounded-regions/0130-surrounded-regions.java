class Solution {
    public void solve(char[][] board) {
        int n=board.length,m=board[0].length;
        for(int i=1;i<n;i++){
            dfs(i,0,board);
            dfs(i,m-1,board);
        }
        for(int j=0;j<m;j++){
            dfs(0,j,board);
            dfs(n-1,j,board);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='S'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(int n, int m, char[][] board){
        if(n<0 || m<0 || n>board.length-1 || m>board[0].length-1 || board[n][m]!='O') return ;
        board[n][m]='S';
        dfs(n+1,m,board);
        dfs(n-1,m,board);
        dfs(n,m+1,board);
        dfs(n,m-1,board);        
    }
}