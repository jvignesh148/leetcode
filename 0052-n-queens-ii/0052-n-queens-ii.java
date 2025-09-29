class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] arr : board) Arrays.fill(arr,'.');
        isPossible(board,0,n);
        return count;
    }
    public void isPossible(char[][] board,int n,int size){
        if(n==size){
            count++;
            return;
        } 
        for(int i=0;i<size;i++){
            if(isSafe(board,n,i,size)) {
                board[n][i]='Q';
                isPossible(board,n+1,size);
                board[n][i]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int n,int m,int size){
        for(int i=0;i<n;i++){
            if(board[i][m]=='Q') return false;
        }
        for(int i=n-1,j=m-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=n-1,j=m+1; i>=0 && j<size;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}