class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] result =  new int[rowSum.length][colSum.length];
        for( int i = 0; i < rowSum.length; i++) { 
            for( int j = 0; j < colSum.length; j++) {
                int min=Math.min(rowSum[i],colSum[j]);
                rowSum[i]-=min;
                colSum[j]-=min;
                result[i][j]=min;
            }
        }
        return result;
    }
}