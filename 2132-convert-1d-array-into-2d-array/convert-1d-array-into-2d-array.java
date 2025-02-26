class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] nums=new int[m][n];
        if(original.length!=m*n) return new int[0][];
        int ind=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=original[ind];
                ind+=1;
            }
        }
        return nums;
    }
}